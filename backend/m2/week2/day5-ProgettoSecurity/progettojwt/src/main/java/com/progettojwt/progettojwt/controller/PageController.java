package com.progettojwt.progettojwt.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import com.progettojwt.progettojwt.models.Dispositivo;
import com.progettojwt.progettojwt.models.Laptop;
import com.progettojwt.progettojwt.models.Ruolo;
import com.progettojwt.progettojwt.models.RuoloType;
import com.progettojwt.progettojwt.models.Stato;
import com.progettojwt.progettojwt.models.Utente;
import com.progettojwt.progettojwt.repositories.DispositivoRepository;
import com.progettojwt.progettojwt.repositories.LaptopRepository;
import com.progettojwt.progettojwt.repositories.SmartphoneRepository;
import com.progettojwt.progettojwt.repositories.TabletRepository;
import com.progettojwt.progettojwt.services.DispositivoService;
import com.progettojwt.progettojwt.services.LaptopService;
import com.progettojwt.progettojwt.services.RoleService;
import com.progettojwt.progettojwt.services.SmartphoneService;
import com.progettojwt.progettojwt.services.TabletService;
import com.progettojwt.progettojwt.services.UserService;

import java.util.*;

import javax.management.relation.Role;

@RestController
@RequestMapping("/app")
public class PageController {

    @Autowired
    UserService ur;

    @Autowired
    RoleService rs;
    
    @Autowired
    DispositivoService ds;
    
    @Autowired
    LaptopService ls;
    
    @Autowired
    SmartphoneService ss;
    
    @Autowired
    TabletService ts;

    @GetMapping("/add-user")
    public String addUser() {
        Utente user = new Utente();
       
        
        
        user.setUsername("gigi3");
        user.setNome("John");
        user.setCognome("Pitt");
        user.setEmail("gigi@gmail.com");
        user.setPassword("test");
        Set<Ruolo> roles = new HashSet<Ruolo>();
        Ruolo admin = rs.getById(1).get();
        roles.add(admin);
        user.setRoles(roles);

        ur.addUser(user);

        return "User added";
    }
    
    @GetMapping("/add-laptop")
    public String addLaptop() {
        Laptop laptop = new Laptop();
       
        
        
        laptop.setStato(Stato.DISPONIBILE);
    ds.addDispositivo(laptop);

        return "laptop added";
    }

    @GetMapping("/add-roles")
    public String addRoles() {
        Ruolo roleAdmin = new Ruolo();
        roleAdmin.setRuoloType(RuoloType.ADMIN);
        rs.addRole(roleAdmin);

        Ruolo roleUser = new Ruolo();
        roleUser.setRuoloType(RuoloType.USER);
        rs.addRole(roleUser);

        return "Roles added";
    }

    @GetMapping("/protected")
    @PreAuthorize("hasRole('ADMIN')")
    public String metodoAuth1() {
        return "se stai vedendo questo sei un admin";
    }

    @GetMapping("/user/{username}")
    @PreAuthorize("hasRole('ADMIN')")
    public Utente getByUsername(@PathVariable("username") String username) {

        Optional<Utente> u = ur.getByName(username);
        if (u.isPresent()) {
            return u.get();
        } else {
            return null;
        }
    }

    @GetMapping("/auth-info")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAuthInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails u = ((UserDetails) principal);
            Utente user = ur.getByName(u.getUsername()).get();
            return String.format("id:%d, email:%s, active:%b", user.getId(), user.getEmail());
        }
        return "Utente non trovato";
    }
}

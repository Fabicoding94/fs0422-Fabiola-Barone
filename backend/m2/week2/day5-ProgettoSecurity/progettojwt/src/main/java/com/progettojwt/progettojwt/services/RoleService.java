package com.progettojwt.progettojwt.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Ruolo;
import com.progettojwt.progettojwt.repositories.RuoloRepository;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RuoloRepository rr;

    public void addRole(Ruolo r) {
        rr.save(r);
    }
    public Optional<Ruolo> getById(long id) {
        return rr.findById(id);
    }
}

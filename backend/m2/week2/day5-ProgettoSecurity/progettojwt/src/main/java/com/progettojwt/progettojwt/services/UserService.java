package com.progettojwt.progettojwt.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Utente;
import com.progettojwt.progettojwt.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository ur;

    public Iterable<Utente> getAll() {
        return ur.findAll();
    }
    public void addUser(Utente u) {
        ur.save(u);
    }
    public Optional<Utente> getById(long id) {
        return ur.findById(id);
    }
    public void deleteById(long id) {
        ur.deleteById(id);
    }

    public Optional<Utente> getByName(String u){
        return ur.findByUsername(u);
    }
}

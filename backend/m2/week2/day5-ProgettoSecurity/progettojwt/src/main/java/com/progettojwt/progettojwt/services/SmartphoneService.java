package com.progettojwt.progettojwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Smartphone;
import com.progettojwt.progettojwt.models.Tablet;
import com.progettojwt.progettojwt.repositories.SmartphoneRepository;
import com.progettojwt.progettojwt.repositories.TabletRepository;

@Service
public class SmartphoneService {

	
	
	@Autowired
    SmartphoneRepository sr;

    public Iterable<Smartphone> getAll() {
        return sr.findAll();
    }
    public void addSmartphone(Smartphone s) {
        sr.save(s);
    }
    
    public Optional<Smartphone> getById(long id) {
        return sr.findById(id);
    }
    public void deleteById(long id) {
        sr.deleteById(id);
    }

	
}

package com.progettojwt.progettojwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Laptop;
import com.progettojwt.progettojwt.models.Tablet;
import com.progettojwt.progettojwt.repositories.LaptopRepository;
import com.progettojwt.progettojwt.repositories.TabletRepository;

@Service
public class LaptopService {

	
	
	@Autowired
    LaptopRepository lr;

    public Iterable<Laptop> getAll() {
        return lr.findAll();
    }
    public void addLaptop(Laptop l) {
        lr.save(l);
    }
    
    public Optional<Laptop> getById(long id) {
        return lr.findById(id);
    }
    public void deleteById(long id) {
        lr.deleteById(id);
    }

	
}

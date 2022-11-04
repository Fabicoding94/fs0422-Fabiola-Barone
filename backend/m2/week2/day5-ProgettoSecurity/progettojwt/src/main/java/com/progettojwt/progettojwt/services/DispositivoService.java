package com.progettojwt.progettojwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Dispositivo;
import com.progettojwt.progettojwt.models.Laptop;
import com.progettojwt.progettojwt.models.Utente;
import com.progettojwt.progettojwt.repositories.DispositivoRepository;
import com.progettojwt.progettojwt.repositories.UserRepository;

@Service
public class DispositivoService {

	
	
	  @Autowired
	    DispositivoRepository dr;

	    public Iterable<Dispositivo> getAll() {
	        return dr.findAll();
	    }
	    public void addDispositivo(Dispositivo d) {
	        dr.save(d);
	    }
	    
	    public Optional<Dispositivo> getById(long id) {
	        return dr.findById(id);
	    }
	    public void deleteById(long id) {
	        dr.deleteById(id);
	    }

	 
	
}

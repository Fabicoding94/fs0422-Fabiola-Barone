package com.progettojwt.progettojwt.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progettojwt.progettojwt.models.Dispositivo;
import com.progettojwt.progettojwt.models.Tablet;
import com.progettojwt.progettojwt.repositories.DispositivoRepository;
import com.progettojwt.progettojwt.repositories.TabletRepository;


@Service
public class TabletService {

	  @Autowired
	    TabletRepository tr;

	    public Iterable<Tablet> getAll() {
	        return tr.findAll();
	    }
	    public void addTablet(Tablet t) {
	        tr.save(t);
	    }
	    
	    public Optional<Tablet> getById(long id) {
	        return tr.findById(id);
	    }
	    public void deleteById(long id) {
	        tr.deleteById(id);
	    }

	
	
}

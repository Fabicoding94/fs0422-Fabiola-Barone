package com.fabiolabarone.springjpa.GestionePrenotazione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Città;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Edificio;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.CittàRepository;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.EdificioRepository;

@Service
public class EdificioService {
	
	
	

		@Autowired
		EdificioRepository ed;
		
		public void saveEdificio(Edificio e) {
			ed.save(e);
		}
		
		public List<Edificio> getAllEdificio(){
			return ed.findAll();
		}
		
		public void deleteEdificioById(long id) {
			ed.deleteById(id);
		}

}

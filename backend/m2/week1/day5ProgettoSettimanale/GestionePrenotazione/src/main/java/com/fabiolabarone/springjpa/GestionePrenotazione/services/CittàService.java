package com.fabiolabarone.springjpa.GestionePrenotazione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Città;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.CittàRepository;

@Service
	public class CittàService {

		@Autowired
		CittàRepository ci;
		
		public void saveCittà(Città c) {
			ci.save(c);
		}
		
		public List<Città> getAllCittà(){
			return ci.findAll();
		}
		
		public void deleteCittàById(long id) {
			ci.deleteById(id);
		}
		
	}

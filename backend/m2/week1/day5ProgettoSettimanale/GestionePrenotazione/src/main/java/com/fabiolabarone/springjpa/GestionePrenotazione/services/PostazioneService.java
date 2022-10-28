package com.fabiolabarone.springjpa.GestionePrenotazione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Città;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Postazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.CittàRepository;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.PostazioneRepository;

@Service
public class PostazioneService {
	
	
	
	

		@Autowired
		PostazioneRepository pos;
		
		public void savePostazione(Postazione p) {
			pos.save(p);
		}
		
		public List<Postazione> getAllPostazione(){
			return pos.findAll();
		}
		
		public void deletePostazioneById(long id) {
			pos.deleteById(id);
		}

}

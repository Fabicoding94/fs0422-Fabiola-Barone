package com.fabiolabarone.springjpa.GestionePrenotazione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Postazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Prenotazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.PostazioneRepository;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {
	

	
		
		
		
		

			@Autowired
			PrenotazioneRepository pren;
			
			public void savePrenotazione(Prenotazione pr) {
				pren.save(pr);
			}
			
			public List<Prenotazione> getAllPrenotazione(){
				return pren.findAll();
			}
			
			public void deletePrenotazioneById(long id) {
				pren.deleteById(id);
			}

}

package com.fabiolabarone.springjpa.GestionePrenotazione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Prenotazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Utente;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.PrenotazioneRepository;
import com.fabiolabarone.springjpa.GestionePrenotazione.repositories.UtenteRepository;

@Service
public class UtenteService {
	
	
				@Autowired
				UtenteRepository ut;
				
				public void saveUtente(Utente u) {
					ut.save(u);
				}
				
				public List<Utente> getAllUtente(){
					return ut.findAll();
				}
				
				public void deleteUtenteById(long id) {
					ut.deleteById(id);
				}

}

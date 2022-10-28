package com.fabiolabarone.springjpa.GestionePrenotazione.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {

}

package com.fabiolabarone.springjpa.GestionePrenotazione.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Città;
@Repository
public interface CittàRepository extends JpaRepository<Città, Long> {

}

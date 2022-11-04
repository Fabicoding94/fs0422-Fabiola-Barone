package com.progettojwt.progettojwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.progettojwt.progettojwt.models.Utente;


	@Repository
	public interface UserRepository extends JpaRepository<Utente, Long> {


	    @Query(
	       "SELECT u FROM Utente u WHERE username LIKE concat('%', :u, '%' )"
	    )
	    Optional<Utente> findByUsername(@Param("u") String u);
	}


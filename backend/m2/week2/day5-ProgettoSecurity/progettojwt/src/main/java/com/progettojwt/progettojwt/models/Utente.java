package com.progettojwt.progettojwt.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Table(name = "utenti")
@Data
public class Utente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private	long id;
	
	@Column( nullable = false)
	private	String username;
	private	String nome;
	private	String cognome;
	private	String email;
	private String password;
	
	@ManyToMany
    @JoinTable(name = "utenti_ruoli", joinColumns = @JoinColumn(name = "utente_id"), inverseJoinColumns = @JoinColumn(name = "ruolo_id"))
	private Set<Ruolo> roles = new HashSet<Ruolo>();
	
	@ManyToMany
    @JoinTable(name = "utenti_dispositivi", joinColumns = @JoinColumn(name = "utente_id"), inverseJoinColumns = @JoinColumn(name = "dispositivo_id"))
	private	List<Dispositivo> dispositivi;

}

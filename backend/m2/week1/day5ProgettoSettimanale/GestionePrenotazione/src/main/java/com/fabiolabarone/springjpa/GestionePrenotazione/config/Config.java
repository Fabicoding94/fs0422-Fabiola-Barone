package com.fabiolabarone.springjpa.GestionePrenotazione.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Città;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Edificio;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Postazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Prenotazione;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Tipo;
import com.fabiolabarone.springjpa.GestionePrenotazione.entities.Utente;

@Configuration
public class Config {

	@Bean
	@Scope("prototype")
	public Città getCittà() {
		return new Città();
	}
	
	@Bean
	@Scope("prototype")
	public Città getRoma() {
		return Città.builder().nomeCittà("Roma").build();
	}
	
	@Bean
	@Scope("prototype")
	public Città getMilano() {
		return Città.builder().nomeCittà("Milano").build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getEdificio() {
		return new Edificio();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getHotel() {
		return Edificio.builder().nomeEdificio("Hotel").indirizzo("via G. Verga 15").città(getRoma()).build();
	}
	
	@Bean
	@Scope("prototype")
	public Edificio getAirbnb() {
		return Edificio.builder().nomeEdificio("CasaVacanze").indirizzo("via Anselmi 18").città(getMilano()).build();

	}
	
	@Bean
	@Scope("prototype")
	public Postazione getPostazione() {
		return new Postazione();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getSala1() {
		return Postazione.builder()
				.descrizione("Sala1")
				.tipo(Tipo.PRIVATO)
				.numeroMassimoPartecipanti(30)
				.edificio(getHotel())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Postazione getSala2() {
		return Postazione.builder()
				.descrizione("Sala2")
				.tipo(Tipo.OPEN_SPACE)
				.numeroMassimoPartecipanti(30)
				.edificio(getAirbnb())
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Utente getUtente() {
		return new Utente();				
	}
	
	@Bean
	@Scope("protorype")
	public Utente getGiovanna() {
		return Utente.builder()
				.nomeCompleto("Giovanna Rossi")
				.email("giovannarossi@gmail.com")
				.username("giovy94")
				.build();
	}
	
	@Bean
	@Scope("protorype")
	public Utente getSharon() {
		return Utente.builder()
				.nomeCompleto("Sharon Verdi")
				.email("sharonverdi@gmail.com")
				.username("sharon87")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Prenotazione getPrenotazione() {
		return new Prenotazione();				
	}
	
	
	@Bean
	@Scope("prototype")
	public Prenotazione getPrenotazione1() {
		return Prenotazione.builder().utente(getSharon()).giorno(LocalDate.of(2022, 01, 04)).postazione(getSala1()).build();				
	}
	
	
	
	
	
	
	
	
	
}

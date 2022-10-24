package models;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tessera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceTessera;
	private LocalDate dataEmissione;
	private boolean validita;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Utente utente;
	
	@OneToMany(mappedBy = "tessera")
	private List <Abbonamento> Abbonamento;
	
	@OneToOne
	private LuogoEmissione luogoEmissione;
	
	Tessera( LocalDate dataEmissione, boolean validita){
	
	this.dataEmissione = dataEmissione;
	this.validita = validita;
	
	
	}
	
	public List<Abbonamento> getAbbonamento() {
		return Abbonamento;
	}

	public void setAbbonamento(Abbonamento abbonamento) {
		Abbonamento.add(abbonamento);
	}

	public LuogoEmissione getLuogoEmissione() {
		return luogoEmissione;
	}

	public void setLuogoEmissione(LuogoEmissione luogoEmissione) {
		this.luogoEmissione = luogoEmissione;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	Tessera(){
		
	}

	public long getCodiceTessera() {
		return codiceTessera;
	}

	public void setCodiceTessera(long codiceTessera) {
		this.codiceTessera = codiceTessera;
	}

	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public boolean isValidita() {
		return validita;
	}

	public void setValidita(boolean validita) {
		this.validita = validita;
	}
	
	
	
}

package models;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Abbonamento extends Items{

	@OneToOne
	private Utente utente;
	private Periodicita periodicita ;
	
	@ManyToOne
	private LuogoEmissione luogo;
	private LocalDate data;
	
	@ManyToOne
	private Tessera tessera;
	
	Abbonamento( boolean validita, Utente utente, Periodicita periodicita , LuogoEmissione luogo, LocalDate data, Tessera tessera ) {
		super(validita);
		this.utente=utente;
		this.periodicita = periodicita;
		this.luogo = luogo;
		this.data = data;
		this.tessera = tessera;
		
	}

	
	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


	@Override
	public String toString() {
		return "Abbonamento [utente=" + utente + ", periodicita=" + periodicita + ", luogo=" + luogo + ", data=" + data
				+ ", tessera=" + tessera + "]";
	}


	public Periodicita getPeriodicita() {
		return periodicita;
	}


	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}


	public LuogoEmissione getLuogo() {
		return luogo;
	}


	public void setLuogo(LuogoEmissione luogo) {
		this.luogo = luogo;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	Abbonamento(){
		
	}
	
	
}




package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public abstract class Mezzo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceMezzo;
	private int capienza;
	private Stato stato;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Tratta tratta;
	
	Mezzo( int capienza, Stato stato, Tratta tratta){
		
		
		this.capienza = capienza;
		this.stato = stato;
		this.tratta = tratta;
		
	
	}
	
	public long getCodiceMezzo() {
		return codiceMezzo;
	}

	public void setCodiceMezzo(long codiceMezzo) {
		this.codiceMezzo = codiceMezzo;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}

	Mezzo(){
		
	}
	
}

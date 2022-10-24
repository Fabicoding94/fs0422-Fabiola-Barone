package models;

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
	
	@OneToOne
	private Tratta tratta;
	
	Mezzo(long codiceMezzo, int capienza, Stato stato, Tratta tratta){
		
		this.codiceMezzo = codiceMezzo;
		this.capienza = capienza;
		this.stato = stato;
		this.tratta = tratta;
	
	}
	
	Mezzo(){
		
	}
	
}

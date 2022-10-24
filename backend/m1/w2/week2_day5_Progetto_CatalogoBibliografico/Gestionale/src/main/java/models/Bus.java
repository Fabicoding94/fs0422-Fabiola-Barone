package models;

import javax.persistence.Entity;

@Entity
public class Bus extends Mezzo {
	
	Bus(long codiceMezzo, int capienza, Stato stato, Tratta tratta){
		super(codiceMezzo,capienza,stato,tratta);
	}
	
	Bus(){}

}

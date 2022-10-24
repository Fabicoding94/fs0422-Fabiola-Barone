package models;

import javax.persistence.Entity;

@Entity
public class Bus extends Mezzo {
	
	
	
	
	Bus( int capienza, Stato stato, Tratta tratta){
		super(capienza,stato,tratta);
	}
	
	Bus(){}
	
	

}

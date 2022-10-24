package models;

import javax.persistence.Entity;

@Entity
public class DistributoreAutomatico extends LuogoEmissione {

	DistributoreAutomatico( String indirizzo, String nome) {
		super(indirizzo, nome);
		// TODO Auto-generated constructor stub
	}
	
	DistributoreAutomatico(){}

}

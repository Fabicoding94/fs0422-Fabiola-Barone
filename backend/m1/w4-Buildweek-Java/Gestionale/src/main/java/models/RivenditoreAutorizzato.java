package models;

import javax.persistence.Entity;

@Entity
public class RivenditoreAutorizzato extends LuogoEmissione {

	RivenditoreAutorizzato( String indirizzo, String nome) {
		super(indirizzo, nome);
		// TODO Auto-generated constructor stub
	}
	
	RivenditoreAutorizzato(){}

}

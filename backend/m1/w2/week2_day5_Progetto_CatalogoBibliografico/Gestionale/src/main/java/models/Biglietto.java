package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;





@Entity
public class Biglietto extends Items {
	
	@ManyToOne
	private LuogoEmissione luogoEmissione;
	

	Biglietto(){
		
	}
	
	public LuogoEmissione getLuogoEmissione() {
		return luogoEmissione;
	}

	public void setLuogoEmissione(LuogoEmissione luogoEmissione) {
		this.luogoEmissione = luogoEmissione;
	}

	Biglietto( boolean validita, LuogoEmissione luogoEmissione) {
		super( validita);
		this.luogoEmissione = luogoEmissione;
		
	}
	
}
	

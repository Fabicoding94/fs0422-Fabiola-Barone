package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tratta {

	@OneToOne
	private Mezzo mezzo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceId;
	private String luogoPartenza;
	private String luogoCapolinea;
	private long tempoMedio;

	
	
	public Mezzo getMezzo() {
		return mezzo;
	}

	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}

	
	

	public long getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(long tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

	Tratta(String luogoPartenza, String luogoCapolinea, long tempoMedio){
		
		this.luogoPartenza = luogoPartenza;
		this.luogoCapolinea = luogoCapolinea;
		this.tempoMedio = tempoMedio;
		
		
	}
	
	Tratta(){}

	public long getCodiceId() {
		return codiceId;
	}

	public void setCodiceId(long codiceId) {
		this.codiceId = codiceId;
	}

	public String getLuogoPartenza() {
		return luogoPartenza;
	}

	public void setLuogoPartenza(String luogoPartenza) {
		this.luogoPartenza = luogoPartenza;
	}

	public String getLuogoCapolinea() {
		return luogoCapolinea;
	}

	public void setLuogoCapolinea(String luogoCapolinea) {
		this.luogoCapolinea = luogoCapolinea;
	}

	
	
	
	
}

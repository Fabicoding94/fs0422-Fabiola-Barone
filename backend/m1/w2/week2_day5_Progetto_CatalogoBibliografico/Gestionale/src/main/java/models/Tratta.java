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
	private int tempoMedio;
	private int tempoEffettivo;
	
	
	Tratta(String luogoPartenza, String luogoCapolinea, int tempoMedio, int tempoEffettivo){
		
		this.luogoPartenza = luogoPartenza;
		this.luogoCapolinea = luogoCapolinea;
		this.tempoMedio = tempoMedio;
		this.tempoEffettivo = tempoEffettivo;
		
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

	public int getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(int tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

	public int getTempoEffettivo() {
		return tempoEffettivo;
	}

	public void setTempoEffettivo(int tempoEffettivo) {
		this.tempoEffettivo = tempoEffettivo;
	}
	
	
	
	
}

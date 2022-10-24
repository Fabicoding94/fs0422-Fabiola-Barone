package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class LuogoEmissione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceLuogo;
	private String indirizzo;
	private String nome;
	
	
	LuogoEmissione( String indirizzo, String nome){
		
		
		this.indirizzo=indirizzo;
		this.nome=nome;
		
	}
	
	public long getCodiceLuogo() {
		return codiceLuogo;
	}

	public void setCodiceLuogo(long codiceLuogo) {
		this.codiceLuogo = codiceLuogo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	LuogoEmissione(){
		
	}
	
	
}

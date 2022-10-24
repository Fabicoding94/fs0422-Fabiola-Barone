package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUtente;
	private String nome;
	
	@OneToOne
	private Tessera tessera;
	
	Utente(Tessera tessera, String nome){
		
		this.tessera = tessera;
		this.nome = nome;
		
		
		
	}

	
	
	public Tessera getTessera() {
		return tessera;
	}



	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	Utente(){
		
	}
	
}

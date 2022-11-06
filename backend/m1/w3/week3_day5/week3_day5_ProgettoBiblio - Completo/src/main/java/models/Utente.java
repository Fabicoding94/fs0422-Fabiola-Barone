package models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import lombok.NoArgsConstructor;



@Entity
@Table(name="utente")
//@Getter //decoratori di lombok
//@Setter
//@ToString
@Data           //@Data contiene al suo interno @Getter, @Setter, @ToString
@NoArgsConstructor


public class Utente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long NumeroTessera;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;

	@OneToMany(mappedBy = "utente", cascade = CascadeType.REMOVE)  //una persona può avere diverse partecipazioni (immagino la partecipazione come un biglietto per l'evento)
	//mappedBy -> "utente" che troviamo nella classe Prestito //cascade remove= se rimuovo l'utente rimuove a cascata tutta la lista di prestiti
	private List<Prestito> listaPrestiti;
	


	public Utente(String nome, String cognome, LocalDate dataNascita, List<Prestito> listaPrestiti) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.listaPrestiti = listaPrestiti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public List<Prestito> getListaPrestiti() {
		return listaPrestiti;
	}

	public void setListaPrestiti(List<Prestito> listaPrestiti) {
		this.listaPrestiti = listaPrestiti;
	}
	
	

	public void setNumeroTessera(long numeroTessera) {
		this.NumeroTessera = numeroTessera;
	}

	public long getNumeroTessera() {
		return NumeroTessera;
	}
	
	
	
	

	
	
	
	
	
	
	
}

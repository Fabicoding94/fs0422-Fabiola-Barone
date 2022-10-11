package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventi")

public class Evento {
	
	@Id
	private int id;
	private String dataevento;
	private String descrizione;
	private String maxpartecipanti;
	
	@Column(name="tipoevento")
	private TipoEvento tipoEvento;
	
	private String titolo;
	
	
	public Evento() {
		
	}


	public Evento(int id ,String dataevento, String descrizione, String maxpartecipanti, TipoEvento tipoEvento, String titolo) {
		super();
		this.id = id;
		this.dataevento = dataevento;
		this.descrizione = descrizione;
		this.maxpartecipanti = maxpartecipanti;
		this.tipoEvento = tipoEvento;
		this.titolo = titolo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDataevento() {
		return dataevento;
	}


	public void setDataevento(String dataevento) {
		this.dataevento = dataevento;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public String getMaxpartecipanti() {
		return maxpartecipanti;
	}


	public void setMaxpartecipanti(String maxpartecipanti) {
		this.maxpartecipanti = maxpartecipanti;
	}


	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}


	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	
	

}

package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Items")
@Getter
@Setter
@ToString
public abstract class Item {

	private String nome;
	private double prezzo;
	
	public Item(String n, double p) {
		this.nome = n;
		this.prezzo = p;
	}
	

}

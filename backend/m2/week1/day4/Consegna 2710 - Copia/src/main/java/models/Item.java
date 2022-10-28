package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Items")
@Getter
@Setter
@ToString
@Inheritance
public abstract class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;

	private String nome;
	private double prezzo;
	
	public Item(String n, double p) {
		this.nome = n;
		this.prezzo = p;
	}
	

}

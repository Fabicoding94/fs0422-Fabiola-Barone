package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "students")


public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //crea un algoritmo di autoincremento
	private int id;
	
	private String name;
	
	private String lastname;
	
	private String votes;
	
	public Student() {
		
	}

	public Student(String name, String lastname, String votes) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}
	
	@Override
	public String toString() {
		
		return this.name+" "+this.lastname;
	}
	
}
	
	//per fare il costrutore in automatico- tasto dx> Source> Generate constructor using fields
	//tolgo la spunta su id > generate 
	//anche i getters e setters li possiamo fare in questo modo - li facciamo tutti tranne che per l'id
	//Poi usiamo questa mappatura nella classe Main
	

	



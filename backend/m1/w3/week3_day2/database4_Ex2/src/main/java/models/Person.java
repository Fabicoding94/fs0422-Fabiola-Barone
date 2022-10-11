package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persone")


public class Person {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //Strateg di autoincremento
	private int id;
	
	private String name;
	
	
    public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	};
    
    
}

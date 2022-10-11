package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="votes")


public class Vote{
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY);
	private int id;
	
	private String vote;
	
	
	@ManyToOne
	@JoinColumn(name= "person5_id")
	private Person5 person;
	
	
	
	
}
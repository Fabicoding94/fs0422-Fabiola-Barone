package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="address")


public class Address {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY);
	private int id;
	
	private String name;
	
	@OneToOne(mappedBy = "address");
	

}

package models;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Libro extends Items {

	private String autore;
	private String genere;
	
	
}

package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //decorator di Lombok che ci da i getter setters toString
@NoArgsConstructor

public class Riviste extends Items {
	

    @Enumerated(EnumType.STRING)
	private Periodicità periodicità;


}

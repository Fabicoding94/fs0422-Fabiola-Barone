package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Tavolo {
	
	private static long currentId = 0;
	@Id
	private long id;
	private int maxCoperti;
	
	@OneToMany
	private List<Ordine> = new 

	@Enumerated(EnumType.STRING)
	private StatoTavolo stato = StatoTavolo.LIBERO;
	
	public Tavolo(int c) {
		this.id = currentId;
		currentId++;
		
		this.maxCoperti = c;
		
		//this.stato = StatoTavolo.LIBERO;
	}

	public void setOccupato() {
		this.stato = StatoTavolo.OCCUPATO;
	}
	public void setLibero() {
		this.stato = StatoTavolo.LIBERO;
	}

}

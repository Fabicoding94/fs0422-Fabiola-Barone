package models;

import lombok.Data;

@Data
public class Tavolo {
	
	private static long currentId = 0;
	
	private long id;
	private int maxCoperti;
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

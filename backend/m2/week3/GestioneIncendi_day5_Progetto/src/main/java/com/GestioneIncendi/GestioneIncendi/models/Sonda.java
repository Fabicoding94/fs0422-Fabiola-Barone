package com.GestioneIncendi.GestioneIncendi.models;

import java.util.List;

import lombok.Data;

@Data
public class Sonda extends Subject  {

	
	private double latitudine;
	private double longitudine;
	private int quantitaDiFumo;
	
	private final int ALLARME_FUMO = 5;
	
	
	
	public Sonda(double latitudine, double longitudine) {
		
		
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		
		
	}
	
	public void setQuantitaDiFumo(int s) {
		this.quantitaDiFumo = s;
		if(this.quantitaDiFumo > this.ALLARME_FUMO) {
			this.notificaObserver();
		}
	}
}

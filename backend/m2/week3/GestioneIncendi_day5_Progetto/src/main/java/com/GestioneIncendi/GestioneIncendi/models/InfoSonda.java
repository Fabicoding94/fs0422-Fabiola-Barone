package com.GestioneIncendi.GestioneIncendi.models;

public class InfoSonda {

	
	
	private double latitudine;
	private double longitudine;
	private int quantitaDiFumo = 0;
	
	
	
	
	
	public InfoSonda(double latitudine, double longitudine, int quantitaDiFumo) {
		super();
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.quantitaDiFumo = quantitaDiFumo;
	}
	public double getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}
	public double getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}
	public int getQuantitaDiFumo() {
		return quantitaDiFumo;
	}
	public void setQuantitaDiFumo(int quantitaDiFumo) {
		this.quantitaDiFumo = quantitaDiFumo;
	}
}

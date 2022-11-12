package com.GestioneIncendi.GestioneIncendi.models;

public class Sonda extends ControlloSonda {

	private int id;
	private String latitudine;
	private String longitudine;
	private int quantitaDiFumo;
	public String getLatitudine() {
		return latitudine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}
	public String getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}
	public int getQuantitaDiFumo() {
		return quantitaDiFumo;
	}
	public void setQuantitaDiFumo(int quantitaDiFumo) {
		this.quantitaDiFumo = quantitaDiFumo;
	}
	public Sonda(int id, String latitudine, String longitudine, int quantitaDiFumo) {
		super();
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.quantitaDiFumo = quantitaDiFumo;
	}
	
	
	public Boolean rilevaFumo() { 
	    if(quantitaDiFumo > 5) { 
	      notifyObservers(); 
	      return true;
	    } else {
	      System.out.println("Livello di fumo: elevato " + quantitaDiFumo );
	      return false;
	    }
	  }

}

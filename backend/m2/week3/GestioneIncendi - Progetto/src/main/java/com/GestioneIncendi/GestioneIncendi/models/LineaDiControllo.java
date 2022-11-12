package com.GestioneIncendi.GestioneIncendi.models;

public class LineaDiControllo {

	private static final String AllarmeUrl = "http://localhost:8080/host/alarm";
	
	
public void	inviaSegnale(Sonda s){
	System.out.println("Livello di fumo: elevato " + s.getId()
	+ " |Latitudine: " + s.getLatitudine()
	+ " |Longitudine: " + s.getLongitudine()
	+ " |Livello del fumo: " + s.getQuantitaDiFumo());
	

if(s.getQuantitaDiFumo() >= 5) {
	System.out.println(
			AllarmeUrl 
			+ "?=idDetector=" + s.getId()
			+ "&lat=" + s.getLatitudine()
			+ "&lon=" + s.getLongitudine()
			+ "&smokelevel=" + s.getQuantitaDiFumo()
			);
}
}
}
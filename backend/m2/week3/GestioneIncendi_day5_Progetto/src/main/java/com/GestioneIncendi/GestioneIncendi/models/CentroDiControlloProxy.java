package com.GestioneIncendi.GestioneIncendi.models;

public class CentroDiControlloProxy implements CentroDiControlloModel {

	private CentroDiControllo c;
	
	public CentroDiControlloProxy( int type) {
		this.c =CentroDiControlloFactory.createCentroDiControllo(type);
	}
	
	public void segnala(double latitudine, double longitudine, int quantitaDiFumo) {
		this.c.segnala(latitudine, longitudine, quantitaDiFumo);
	}
	
}

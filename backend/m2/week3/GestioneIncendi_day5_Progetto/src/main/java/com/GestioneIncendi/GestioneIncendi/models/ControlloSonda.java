package com.GestioneIncendi.GestioneIncendi.models;

import java.util.ArrayList;
import java.util.List;

public class ControlloSonda implements Observer {

	
	CentroDiControlloProxy centroDiControllo;
	
	public ControlloSonda(CentroDiControlloProxy c) {
		this.centroDiControllo = c;
	}
	
	public void notifica(Subject s) {
		InfoSonda sonda = createSonda((Sonda) s);
		this.centroDiControllo.segnala(sonda.getLatitudine(), sonda.getLongitudine(), sonda.getQuantitaDiFumo());
	}
	
	public InfoSonda createSonda(Sonda s) {
		return new InfoSonda(s.getLatitudine(), s.getLongitudine(), s.getQuantitaDiFumo());
	}
	

}

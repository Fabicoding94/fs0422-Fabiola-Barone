package com.GestioneIncendi.GestioneIncendi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CentroDiControllo implements CentroDiControlloModel{

	
	String nome;
	String password;
	
	public String getNome() {
		return this.nome;
	}
	
	
	
	@Override
	public void segnala(double latitudine, double longitudine, int quantitaDiFumo) {
		System.out.print("ALLARME INCENDIO! Al " + this.nome + " coordinate sonda " + "LAT: " + latitudine + " e LONG: " + longitudine);
		
	}



	 
}

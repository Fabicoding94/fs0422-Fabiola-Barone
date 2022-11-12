package com.GestioneIncendi.GestioneIncendi.models;

import lombok.Builder;

@Builder
public class CentroDiControlloFactory {

	public static CentroDiControllo createCentroDiControllo(int type) {
		switch(type) {
		case 0:
			return new CentroDiControllo();
		case 1:
			return new CentroDiControllo("Centro1", "pass1");
		case 2:
			return new CentroDiControllo().builder()
					.nome("Centro2")
					.password("pass2")
					.build();
			default:
				throw new RuntimeException("Scelta non valida, inserire 1 o 2!");
		}
	}
	
}

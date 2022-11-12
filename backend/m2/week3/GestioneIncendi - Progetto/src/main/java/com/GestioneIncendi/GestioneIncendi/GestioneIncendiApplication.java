package com.GestioneIncendi.GestioneIncendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GestioneIncendi.GestioneIncendi.models.CentroDiControllo;
import com.GestioneIncendi.GestioneIncendi.models.Sonda;

@SpringBootApplication
public class GestioneIncendiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);
	

	
	CentroDiControllo cdc = new CentroDiControllo();
	
	//(id lat, long, smoke level)
	Sonda s1 = new Sonda(1, "22.7", "18.4", 0);
	s1.register(cdc);
	
	s1.rilevaFumo();
	s1.setQuantitaDiFumo(3);
	s1.rilevaFumo();
	s1.setQuantitaDiFumo(9);
	s1.rilevaFumo();
	
	}
}

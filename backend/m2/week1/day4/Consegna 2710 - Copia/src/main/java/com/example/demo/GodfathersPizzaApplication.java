package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Menu;

@SpringBootApplication
public class GodfathersPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);
		
		System.out.print("Hello world");
		
		
		//Menu m = new Menu("M1"); -> qua leggo il menu dal Bean
		
		//System.out.println(m);
	}

}

package models;

import org.springframework.beans.factory.annotation.Autowired;

public class PizzaHawaiian extends Pizza {
	
	@Autowired
	Ananas ananas;

	public PizzaHawaiian() {
		super("Hawaiian", 10d,400d);
		this.addTopping(ananas);
		this.addTopping(new Prosciutto());
	}

}

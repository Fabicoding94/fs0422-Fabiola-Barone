package models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;

public class PizzaBase extends Pizza {

	public PizzaBase() {
		super("Pizza", 5d, 25d);	
	}
	
	@Override
	public List<Topping> getTuttiIngredienti() {
		return this.getIngredienti();
	}

}

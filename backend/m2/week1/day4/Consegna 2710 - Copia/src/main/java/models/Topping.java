package models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Topping extends FoodItem {
	
	@ManyToMany(mappedby ="ingredienti")
	public Topping(String n, double p, double c) {
		super(n, p, c);
	}
	
	public String toString() {
		return this.getNome() + " - " + this.getCalorie() + " - " + this.getPrezzo();
	}

}

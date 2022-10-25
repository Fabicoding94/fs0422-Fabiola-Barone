package models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public abstract class FoodItem extends Item {

	private double calorie;
	
	public FoodItem(String s, double p, double c) {
		super(s, p);
		this.calorie = c;
	}
	
}
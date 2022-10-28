package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Menus")
@AllArgsConstructor
@Getter
@Setter
public class Menu {

	@Id
	private Long id;
	String nome;
	
	@ManyToMany
	List<Pizza> pizze = new ArrayList();
	List<Drink> drinks = new ArrayList();
	List<Topping> toppings = new ArrayList();
	List<Merchandise> merch = new ArrayList();
	List<Pizza> custom = new ArrayList();
	
	public Menu() {
		
	}
	
	public String toString() {
		String res = "MENU - " + this.getNome(); 
		res += "***PIZZE***\n";
		for(int i = 0; i < this.pizze.size(); i ++) {
			res += pizze.get(i);
			res += "\n";
		}res += "***DRINKS***\n";
		for(int i = 0; i < this.drinks.size(); i ++) {
			res += drinks.get(i);
			res += "\n";
		}res += "***MERCH***\n";
		for(int i = 0; i < this.merch.size(); i ++) {
			res += merch.get(i);
			res += "\n";
		}res += "***TOPPINGS***\n";
		for(int i = 0; i < this.toppings.size(); i ++) {
			res += toppings.get(i);
			res += "\n";
		}res += "***CUSTOM***\n";
		for(int i = 0; i < this.custom.size(); i ++) {
			res += custom.get(i);
			res += "\n";
		}
		
		return res;
	}

}

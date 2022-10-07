package week2_day4_z.PomeEx;

public class Prodotto {
	static Long id;
	String name;
	Categoria category;
	Double price;
	
	public Prodotto (String name, Categoria category, Double price ) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

}

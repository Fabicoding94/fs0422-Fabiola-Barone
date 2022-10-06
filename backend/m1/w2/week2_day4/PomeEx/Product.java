package week2_day4_z.PomeEx;

public class Product {
	static Long id;
	String name;
	Categories category;
	Double price;
	
	public Product (String name, Categories category, Double price ) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

}

package week2_day5_Progetto_CatalogoBibliografico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Catalogo c = new Catalogo("c1");
		
		c.leggiCatalogo();
		if(c.items.size() == 0) {
			do {
				c.nuovoItem();
			} while(c.items.size() < 2);
		}
		
		
		

	}

}
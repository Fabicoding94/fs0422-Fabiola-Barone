package week2_day5_Progetto_CatalogoBibliografico;

public class Riviste extends Items {
 Periodicità periodicità;
	
	
	public Riviste(long ISBN, String titolo, int anno, int pagine, Periodicità periodicità) {
		super(ISBN, titolo, anno, pagine);
		this.periodicità = periodicità;
		
	}
	@Override
	public String toString() {
		return "R," + super.toString() + ","+this.periodicità;
	}
	

}



package week2_day5_Progetto_CatalogoBibliografico;

public class Riviste extends Libri_o_riviste {
	private Periodicità periodicità;
	
	
	public Riviste(Long ISBN, String titolo, String anno, int pagine, Periodicità periodicità) {
		super(ISBN, titolo, anno, pagine);
		this.periodicità = periodicità;
		
	}
	public String toString() {
		return "(" + this.ISBN + ", " + this.titolo  + ", " +  this.anno + ", "+  this.pagine +  ", " + this.periodicità + ")" + "\n";
	}
	

}

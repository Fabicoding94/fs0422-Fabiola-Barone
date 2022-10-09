package week2_day5_Progetto_CatalogoBibliografico;

public class Libri extends Libri_o_riviste {

	
	private String autore;
	private String genere;
	
	public Libri(Long ISBN, String titolo, String anno, int pagine, String autore, String genere) {
		super(ISBN, titolo, anno, pagine);
		this.autore = autore;
		this.genere = genere;
		
	}
	
	public String toString() {
		return "(" + this.ISBN + ", " + this.titolo + ", " +  this.anno + ", "+  this.pagine + ", " + this.autore +  ", " +  this.genere +  ")" + "\n";
	}
	
	
	
	
	
}

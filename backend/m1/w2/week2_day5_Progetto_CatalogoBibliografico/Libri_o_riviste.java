package week2_day5_Progetto_CatalogoBibliografico;

public class Libri_o_riviste {
	
	protected Long ISBN;
	protected String titolo;
	protected String anno;
	protected int pagine;
	
	
	public Libri_o_riviste( Long ISBN, String titolo, String anno, int pagine) {
		this.ISBN= ISBN;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
		
	}
	
	public Long getISBN() {
		return this.ISBN;
	}
	public String titolo() {
		return this.titolo;
	}
	public String anno() {
		return this.anno;
	}
	public int pagine() {
		return this.pagine;
	}
	
	
	
	

}

package week2_day5_Progetto_CatalogoBibliografico;

public class Items {
	
	protected Long ISBN;
	protected String titolo;
	protected int anno;
	protected int pagine;
	
	
	public Items( long ISBN, String titolo, int anno, int pagine) {
		this.ISBN= ISBN;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
		
	}

	public long getISBN() {
		return this.ISBN;
	}
	
	public int getAnno() {
		return this.anno;
	}
	public String toString() {
			return this.ISBN+","+titolo+","+anno+","+pagine;
	}
	
	
	
	

}

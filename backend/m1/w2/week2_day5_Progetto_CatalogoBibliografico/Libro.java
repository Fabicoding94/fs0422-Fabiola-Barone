package week2_day5_Progetto_CatalogoBibliografico;

public class Libro extends Items {

	
	 String autore;
	 Genere genere;
	
	 public Libro(long ISBN, String titolo, int anno, int pagine, String autore, Genere genere) {
			super(ISBN, titolo, anno, pagine);
			this.autore = autore;
			this.genere = genere;
			
		}
	public String getAutore(){
		return autore;
	}
	
	@Override
	public String toString() {
		return "( L, " + super.toString() + ", " + this.pagine + ", " + this.getAutore() +  ", " +  this.genere +  ")" + "\n";
	}
	
	
	
	
	
}

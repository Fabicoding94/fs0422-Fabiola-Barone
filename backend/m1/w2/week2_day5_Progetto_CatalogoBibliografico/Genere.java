package week2_day5_Progetto_CatalogoBibliografico;

public enum Genere {
	HORROR,
	GIALLO,
	NARRATIVA,
	UNDEFINED;
	
	public static Genere getFromString(String s) {
		for(Genere g : Genere.values()) {
			if(g.toString().equalsIgnoreCase(s)) {
				return g;
			} 
		}
		return UNDEFINED;
	}
}
package week2_day5_Progetto_CatalogoBibliografico;

public enum Periodicità {
	SETTIMANALE,
	MENSILE,
	SEMESTRALE,
    UNDEFINED;
	

	public static Periodicità getFromString(String s) {
		for(Periodicità p : Periodicità.values()) {
			if(p.toString().equalsIgnoreCase(s)) {
				return p;
			} 
		}
		return UNDEFINED;
	}

}

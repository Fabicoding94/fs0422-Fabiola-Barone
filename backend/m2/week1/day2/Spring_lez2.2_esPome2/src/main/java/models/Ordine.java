package models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Ordine {

	
	private long id;
	private StatoOrdine stato = StatoOrdine.IN_CORSO;
	private Tavolo tavolo;
	private int nCoperti;
	private int ora = LocalDateTime.now().getHour();
	
	
	private Map<Integer, ProdottoOrdine> listaOrdine = new HashMap<Integer, ProdottoOrdine>();
	
	public Ordine(Tavolo t, int n) {
		this.tavolo = t;
		this.nCoperti= n;
	}
	
}

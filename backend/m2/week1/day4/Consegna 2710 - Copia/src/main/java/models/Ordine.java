package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Ordine {
	
	private long id;
	private StatoOrdine stato = StatoOrdine.IN_CORSO;
	private Tavolo tavolo;
	private int nCoperti;
	private int ora = LocalDateTime.now().getHour();
	
	@Value("${costanti.costocoperto}")
	private double costoCoperto;

	//private Map<Integer, ProdottoOrdine> listaOrdine = new HashMap<Integer, ProdottoOrdine>();
	private Map<ProdottoOrdine, Integer> listaOrdine = new HashMap<ProdottoOrdine, Integer>();
	//private List<ProdottoOrdine> listaOrdine = new ArrayList<ProdottoOrdine>();

	public Ordine(Tavolo t, int n) {
		this.tavolo = t;
		this.nCoperti = n;
	}

	//public void aggiungiProdottoOrdine(Item i, String nota) {
	public void aggiungiProdottoOrdine(ProdottoOrdine p) {
		//listaOrdine.put(listaOrdine.size(), new ProdottoOrdine(i, nota));
		if(listaOrdine.containsKey(p)) {
			listaOrdine.put(p, listaOrdine.get(p) + 1);
		} else {
			listaOrdine.put(p, 1);	
		}
		
	}
	
	public void rimuoviProdottoOrdine(ProdottoOrdine p) {
		if(listaOrdine.containsKey(p)) {
			if(listaOrdine.get(p) == 1) {
				listaOrdine.remove(p);
			} else {
				listaOrdine.put(p, listaOrdine.get(p) - 1);
			}
		}
	}
	
	public void creaProdottoEAggiungi(Item i, String note) {
		ProdottoOrdine p = new ProdottoOrdine(i, note);
		this.aggiungiProdottoOrdine(p);
	}
	
	public double getTotale() {
		double tot = 0d;
		tot += nCoperti * costoCoperto;
		for(ProdottoOrdine p : listaOrdine.keySet()) {
			tot += p.getItem().getPrezzo();
		}
		return tot;
	}
	
	
	
	
	
	

}

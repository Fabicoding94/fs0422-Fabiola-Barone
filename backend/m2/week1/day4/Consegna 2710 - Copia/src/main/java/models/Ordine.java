package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Entity
@Data
public class Ordine {
	
	@Id
	private long id;
	@Enumerated(EnumType.STRING)
	private StatoOrdine stato = StatoOrdine.IN_CORSO;
	@ManyToOne
	private Tavolo tavolo;
	private int nCoperti;
	private int ora = LocalDateTime.now().getHour();
	
	@Value("${costanti.costocoperto}")
	private double costoCoperto;

	//private Map<Integer, ProdottoOrdine> listaOrdine = new HashMap<Integer, ProdottoOrdine>();
	@ElementCollection
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

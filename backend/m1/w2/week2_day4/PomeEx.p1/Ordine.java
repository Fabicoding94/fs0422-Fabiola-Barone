package week2_day4_z.PomeEx;

import java.time.LocalDate;
import java.util.List;
import week2_day4_z.PomeEx.Cliente;

public class Ordine {
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Prodotto> prodotti;
	private Cliente cliente;
	
	public Ordine(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Prodotto> prodotti, Cliente cliente){
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.prodotti = prodotti;
		this.cliente = cliente;
		
	}
	
	public LocalDate getOrderDate() {
		return this.orderDate;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public List<Prodotto> getProdotti() {
		return this.prodotti;
	}
		
	

	public String toString() {
		return "Ordine:" + this.id + "-" + this.prodotti;
	}

}
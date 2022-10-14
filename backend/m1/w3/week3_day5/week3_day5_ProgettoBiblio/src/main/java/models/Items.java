package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Items")
@Inheritance
public class Items {

	
		@Id
		@SequenceGenerator(name = "items_seq", sequenceName = "items_seq", allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "items_seq")
		protected long id;
		protected long ISBN;
		protected String titolo;
		protected int anno;
		protected int pagine;
		

		@OneToOne
		private Utente utente;
		
		@OneToMany (mappedBy = "item", cascade = CascadeType.REMOVE) 
		private List<Prestito> listaPrestiti;

		public long getISBN() {
			return ISBN;
		}

		public void setISBN(long iSBN) {
			ISBN = iSBN;
		}

		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public int getAnno() {
			return anno;
		}

		public void setAnno(int anno) {
			this.anno = anno;
		}

		public int getPagine() {
			return pagine;
		}

		public void setPagine(int pagine) {
			this.pagine = pagine;
		}

		public Utente getUtente() {
			return utente;
		}

		public void setUtente(Utente utente) {
			this.utente = utente;
		}

	
		public List<Prestito> getListaPrestiti() {
			return listaPrestiti;
		}

		public void setListaPrestiti(List<Prestito> listaPrestiti) {
			this.listaPrestiti = listaPrestiti;
		}

		public long getId() {
			return id;
		}
		
		
		
		
	

	
		
}

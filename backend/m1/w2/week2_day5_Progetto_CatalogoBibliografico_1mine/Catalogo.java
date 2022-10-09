package week2_day5_Progetto_CatalogoBibliografico;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Catalogo {
	
	
private static Scanner s = new Scanner(System.in); 
	
	private File file;
	
	List<Items> items;
	
    String encoding = "UTF-8";
	 
	//Map<String, Item> = new HashMap<>;
	
	public Catalogo(String nome) {
		this.items = new ArrayList<Items>();
		this.file = new File(nome + ".txt");
	}
	
	public void nuovoItem() {
		System.out.println("Che oggetto vuoi creare?\r1-Libro\r2-Rivista");
		int tipo = Integer.valueOf(s.nextLine());
		
		long ISBN;
		do {
			System.out.println("Inserire ISBN");
			ISBN = Long.valueOf(s.nextLine());
		} while(this.getItemISBN(ISBN) != null);

		System.out.println("Inserire titolo");
		String titolo = s.nextLine();

		System.out.println("Inserire anno");
		int anno = Integer.valueOf(s.nextLine());

		System.out.println("Inserire pagine");
		int pagine = Integer.valueOf(s.nextLine());
		
		


		
		//Genere g = Genere.valueOf(s.nextLine());

		if(tipo == 1) {
			System.out.println("Inserire genere");
			Genere g = Genere.getFromString(s.nextLine());

			System.out.println("Inserire autore");
			String autore = s.nextLine();
			
			addLibro(ISBN, titolo, anno, pagine, autore, g);
		} else {
			System.out.println("Inserire periodicita");
			Periodicità p = Periodicità.getFromString(s.nextLine());
			
			addRivista(ISBN, titolo, anno, pagine, p);
		}
	}
	
	private void addLibro(long ISBN, String titolo, int anno, int pagine, String autore, Genere g) {
		this.items.add(new Libro(ISBN, titolo, anno, pagine, autore, g));
	}
	
	private void addRivista(long ISBN, String titolo, int anno, int pagine, Periodicità p) {
		this.items.add(new Riviste(ISBN, titolo, anno, pagine, p));
	}
	

	public Items getItemISBN(long isbn) {
		List<Items> l = items.stream().filter(i -> i.getISBN() == isbn).collect(Collectors.toList());
		if(l.size() > 0) {
			return l.get(0);
		}
		System.out.println("Elemento non trovato");
		return null;
	}

	public List<Items> getItemsAnno(int a) {
		return items.stream()
				.filter(i -> i.getAnno() == a)
				.collect(Collectors.toList());
	}

	public List<Items> getAutore(String a) {
		return items.stream()
		.filter(i -> i instanceof Libro)
		.filter(i -> ((Libro)i).getAutore() == a)
		.collect(Collectors.toList());
	}
	
	public void salvaCatalogo() {
		String content = "";
		for(Items i : items) {
			content += i + "\r";
		}
		if(file.exists()) {
			try {
				FileUtils.writeStringToFile(file, content, encoding);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void leggiCatalogo() {
		String res = FileUtils.readFileToString(file, encoding);
		String[] righe = res.split("\r");
		for(String r : righe) {
			List<String> data = r.split(",");
			if(data.get(0) == "L") this.addLibro(Integer.valueOf(data[1]), data[2], Integer.valueOf(data[3]), Integer.valueOf(data[4]), Genere.getFromString(data[5]), data[6]);
			else this.addRivista(Integer.valueOf(data[1]), data[2], Integer.valueOf(data[3]), Integer.valueOf(data[4]), Periodicita.getFromString(data[5]));
		}
	}
	
	public void rimuoviItem(long ISBN) {
		if(this.getItemISBN(ISBN) != null) {
			items = items.stream()
					.filter(i -> i.getISBN() != ISBN)
					.collect(Collectors.toList());
			System.out.println("Elemento eliminato");
			
		}
	}
	
	

}
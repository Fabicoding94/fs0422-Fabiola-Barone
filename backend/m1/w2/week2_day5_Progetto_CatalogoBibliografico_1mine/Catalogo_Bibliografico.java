package week2_day5_Progetto_CatalogoBibliografico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Catalogo_Bibliografico {

	public static void main(String[] args) {
		
		//Creo la lista libri e la lista riviste
		
		Archivio_libri_e_riviste archivioLibri = new Archivio_libri_e_riviste();
		Archivio_libri_e_riviste archivioRiviste = new Archivio_libri_e_riviste();
		
		/*List<Libri> lista_Libri = new ArrayList<Libri>();
		
		List<Riviste> lista_Riviste = new ArrayList<Riviste>();*/
		
		//istanzio dei nuovi libri e delle nuove riviste
		/*Libri libro1 = new Libri ( (long) 978159961, "La Divina Commedia", "2017", 232, "Dante Alighieri", "Poema epico");
		Libri libro2 = new Libri ( (long) 978159963, "I Promessi Sposi", "2015", 432, "Alessandro Manzoni", "Romanzo");
		Libri libro3 = new Libri ( (long) 978159954, "Romeo e Giulietta", "2017", 202, "Shakespeare", "Tragedia");
		
		Riviste rivista1 = new Riviste ( (long) 978159961, "Le Scienze", "1968", 45, Periodicità.MENSILE );
		Riviste rivista2 = new Riviste ( (long) 978159961, "Nature", "1869", 33, Periodicità.SETTIMANALE );
		Riviste rivista3 = new Riviste ( (long) 978159961, "National Geographic Magazine", "1888", 45, Periodicità.MENSILE );
		
		//Aggiungo i libri e le riviste istanzioate alle rispettive liste
		
		archivioLibri.addLibro(libro1);
		/*archivioLibri.add(libro2);
		archivioLibri.add(libro3);
		
		archivioRiviste.add(rivista1);
		archivioRiviste.add(rivista2);
		archivioRiviste.add(rivista3);*/
		
	
		
		
		Scanner s = new Scanner(System.in);
		int ch;
		do {
			System.out.println(archivioLibri.getlibriPresenti());
			System.out.println(archivioRiviste.getRivistePresenti());
		System.out.println("0.INSERISCI un libro");
		System.out.println("1.INSERISCI una rivista");
		System.out.println("2.RIMUOVI un libro/rivista tramite ISBN");
		System.out.println("3.RICERCA un libro/rivista per ISBN");
		System.out.println("4.RICERCA un libro/rivista per anno di publicazione");
		System.out.println("5.RICERCA un libro per autore");
		System.out.println("Inserisci azione: ");
		ch= s.nextInt();
		
		switch(ch) {
		case 0:
			System.out.println("Inserisci ISBN: ");
			long ISBN = s.nextLong();
			System.out.println("Inserisci titolo:");
			String titolo = s.nextLine();
			System.out.println("Inserisci anno: ");
			String anno = s.nextLine();
			System.out.println("Inserisci pagine: ");
			int pagine = s.nextInt();
			System.out.println("Inserisci autore: ");
			String autore = s.nextLine();
			System.out.println("Inserisci genere: ");
			String genere = s.nextLine();
			
			archivioLibri.addLibro(ISBN, titolo, anno, pagine, autore, genere);
			
			break;
			
			
		
		}
	    
	    
		}while(ch < 6);
	
	

}}

package models;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import DAO.ItemsDAO;
import DAO.PrestitoDAO;
import DAO.UtenteDAO;
import lombok.Data;


public class Main {
	
	static UtenteDAO udao = new UtenteDAO();
	static ItemsDAO idao = new ItemsDAO();
	static PrestitoDAO prdao = new PrestitoDAO();

	public static void main(String[] args) {
		
		
		Utente u2 = new Utente();
		u2.setNome("Fabiola");
		u2.setCognome("Barone");
		
		u2.setDataNascita(LocalDate.now());
		
		
		udao.save(u2);
		
		
		
		nuovoItem();
		
		System.out.println(idao.findByISBN(1).getTitolo());
		
		
	}
	
	private static Scanner s = new Scanner(System.in); 
	
	public static void nuovoItem() {
		Items i;
		System.out.println("Che oggetto vuoi creare?\r1-Libro\r2-Rivista");
		int tipo = Integer.valueOf(s.nextLine());
		if(tipo == 1) {
		i = new Libro();
		} else {
		 i = new Riviste();
		}
		
		System.out.println("Inserire titolo");
		String titolo = s.nextLine();
		i.setTitolo(titolo);
		
		System.out.println("Inserire anno");
		int anno = Integer.valueOf(s.nextLine());
		i.setAnno(anno);

		System.out.println("Inserire pagine");
		int pagine = Integer.valueOf(s.nextLine());
		i.setPagine(pagine);
		
		idao.save(i);

	}
}

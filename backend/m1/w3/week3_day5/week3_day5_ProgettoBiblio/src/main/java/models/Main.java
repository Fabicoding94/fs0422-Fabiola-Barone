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


public class Main {
	
	static UtenteDAO udao = new UtenteDAO();
	static ItemsDAO idao = new ItemsDAO();
	static PrestitoDAO prdao = new PrestitoDAO();

	public static void main(String[] args) {
		
		
		Utente u1 = new Utente();
		u1.setNome("Fabi");
		u1.setCognome("Barone");
		
		u1.setDataNascita(LocalDate.now());
		
		
		udao.save(u1);

	}
	private static Scanner s = new Scanner(System.in); 
	
	public void nuovoItem() {
		System.out.println("Che oggetto vuoi creare?\r1-Libro\r2-Rivista");
		int tipo = Integer.valueOf(s.nextLine());
		
		long ISBN;
		do {
			System.out.println("Inserire ISBN");
			ISBN = Long.valueOf(s.nextLine());
		} while(this.getISBN(ISBN) != null);

		System.out.println("Inserire titolo");
		String titolo = s.nextLine();

		System.out.println("Inserire anno");
		int anno = Integer.valueOf(s.nextLine());

		System.out.println("Inserire pagine");
		int pagine = Integer.valueOf(s.nextLine());
		
		


}

package database_1my;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Student;

public class Main {

	public static void main(String[] args) {
		
		insertStudent("Mario", "Rossi", "7,8,9,2");
		
		System.out.println("here");
		
		//collegamento con il file persistence.xml
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("database_1");

		//direttore delle Entity che abbiamo nella nostra applicazione
		EntityManager em = emf.createEntityManager();
		
		//Parte la transizione
		Student s = new Student("Fabiola", "Barone", "10, 9, 8, 7");
		Student s2 = new Student("Maria", "Rossini", "3, 6, 8, 7");
		
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		
		em.persist(s);
		em.persist(s2);
		
		t.commit();
		
		em.close();
		
		emf.close();

	}
	
	public static void insertStudent(String name, String lastname, String voti) {
		
	}

}

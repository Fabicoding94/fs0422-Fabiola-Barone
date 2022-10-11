package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		
		insertPerson("mario");
		insertPerson("maria");
		insertPerson("lisa");
	}
		
		
		
		public static void insertPerson(String name) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex2");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction et= em.getTransaction();
			
			
			
			Person p = new Person(name );
			
			et.begin();
			em.persist(p);
			et.commit();
			
			em.close();
			emf.close();
		
		
	}

	}



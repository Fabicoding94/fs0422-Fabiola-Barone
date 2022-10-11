package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	
	private static String pu = "database3_week3day2";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(pu);
		EntityManager em = emf.createEntityManager();
		
		
		Evento eu1 = new Evento(5,"21/11/22", "Sagra del Tartufo", "200", TipoEvento.PUBBLICO, "Tartufo Party" );
		Evento eu2 = new Evento(6,"22/11/22", "Sagra del Ciliegio", "200", TipoEvento.PUBBLICO, "Ciliegie Day Party" );
		
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(eu1);
		em.persist(eu2);
		t.commit();
		
		
		em.close();
		emf.close();
		
		
	}

}

package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import models.Items;
import models.Libro;
import models.Prestito;
import util.JpaUtils;

public class PrestitoDAO {
	
	
public Prestito findByIdPrestito(long idPrestito) {
		
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	return em.find(Prestito.class, idPrestito);
	    } finally {
	    	em.close();
	    }
	}
	
	public void refresh(Prestito pr) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	em.refresh(pr);
	    } finally {
	    	em.close();
	    }
	}

	public void save(Prestito pr) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(pr);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}
	
	
	public void delete(Prestito pr) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(pr);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}

public static List <Prestito> prestitiByTessera(Long tessera){
	EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :tessera AND p.dataRestituzione IS NOT NULL");
	q.setParameter(0, tessera);
	return q.getResultList();
}
	
public static List <Prestito> prestitiScadutiNonRestituiti(){
	EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	Query q = em.createQuery("SELECT p FROM Prestiti p WHERE p.dataRestituzionePrevista IS NOT NULL");
	return q.getResultList();
}
	

}

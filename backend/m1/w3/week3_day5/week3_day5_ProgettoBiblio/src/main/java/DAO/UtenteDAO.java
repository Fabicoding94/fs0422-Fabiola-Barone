package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import models.Utente;
import util.JpaUtils;

public class UtenteDAO {
	
	
	
public Utente findByNumeroTessera(long NumeroTessera) {
		
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	return em.find(Utente.class, NumeroTessera);
	    } finally {
	    	em.close();
	    }
	}
	
	public void refresh(Utente u) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	em.refresh(u);
	    } finally {
	    	em.close();
	    }
	}

	public void save(Utente u) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(u);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}
	
	
	public void delete(Utente u) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(u);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}


}

package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


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

	
	
	

}

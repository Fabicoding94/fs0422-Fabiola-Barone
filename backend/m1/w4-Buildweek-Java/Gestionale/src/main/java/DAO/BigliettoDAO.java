package DAO;



import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Biglietto;
import util.JpaUtils;

public class BigliettoDAO {
	
public Biglietto findBigliettoDAO(long codiceId) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Biglietto.class, codiceId);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(Biglietto b) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(b);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(Biglietto b) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(b);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(BigliettoDAO b) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(b);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}


package DAO;



import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.RivenditoreAutorizzato;
import util.JpaUtils;

public class RivenditoreAutorizzatoDAO {
	
public RivenditoreAutorizzato findLuogoEmissione(long codiceLuogo) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(RivenditoreAutorizzato.class, codiceLuogo);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(RivenditoreAutorizzato ri) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(ri);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(RivenditoreAutorizzato ri) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(ri);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(RivenditoreAutorizzato ri) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(ri);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}


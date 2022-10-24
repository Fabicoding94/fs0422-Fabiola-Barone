package DAO;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import models.Tratta;

	import util.JpaUtils;

	public class TrattaDAO {
	  
	  
		private static final Logger logger = ( Logger ) LoggerFactory.getLogger(TrattaDAO.class);
		
	public Tratta findTratta(long codiceId) {
	    
		
		
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Tratta.class, codiceId);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refreshTratta(Tratta t) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(t);
	      } finally {
	        em.close();
	      }
	  }

	  public void saveTratta(Tratta t) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(t);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void deleteTratta(Tratta t) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(t);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}
	


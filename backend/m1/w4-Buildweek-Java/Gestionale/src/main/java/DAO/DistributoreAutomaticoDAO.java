package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.DistributoreAutomatico;
import util.JpaUtils;

public class DistributoreAutomaticoDAO {
	
public DistributoreAutomatico findDistributoreAutomatico(long codiceLuogo) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(DistributoreAutomatico.class, codiceLuogo);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(DistributoreAutomatico l) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(l);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(DistributoreAutomatico l) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(l);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(DistributoreAutomatico l) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(l);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}



package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Tram;
import util.JpaUtils;

public class TramDAO {
	
public Tram findTramDAO(long codiceMezzo) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Tram.class, codiceMezzo);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(Tram tr) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(tr);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(Tram tr) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(tr);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(Tram tr) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(tr);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}
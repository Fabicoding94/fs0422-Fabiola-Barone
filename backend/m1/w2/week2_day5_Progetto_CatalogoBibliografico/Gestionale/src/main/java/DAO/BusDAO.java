package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Bus;
import util.JpaUtils;

public class BusDAO {
	
public Bus findBusDAO(long codiceMezzo) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Bus.class, codiceMezzo);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(Bus bus) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(bus);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(Bus bus) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(bus);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(Bus bus) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(bus);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}

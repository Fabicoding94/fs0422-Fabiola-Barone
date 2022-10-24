package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Abbonamento;
import util.JpaUtils;

public class AbbonamentoDAO {
	
public Abbonamento findBigliettoDAO(long codiceId) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Abbonamento.class, codiceId);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(Abbonamento a) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(a);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(Abbonamento a) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(a);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(Abbonamento a) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(a);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}
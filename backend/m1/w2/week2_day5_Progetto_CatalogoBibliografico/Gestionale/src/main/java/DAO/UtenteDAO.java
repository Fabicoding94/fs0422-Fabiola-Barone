package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Utente;
import util.JpaUtils;

public class UtenteDAO {
	
public Utente findUtenteDAO(long codiceTessera) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Utente.class, codiceTessera);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refresh(Utente ut) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(ut);
	      } finally {
	        em.close();
	      }
	  }

	  public void save(Utente ut) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(ut);
	        
	        et.commit();
	        
	      } catch (Exception ex) {ex.printStackTrace();
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void delete(Utente ut) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(ut);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}
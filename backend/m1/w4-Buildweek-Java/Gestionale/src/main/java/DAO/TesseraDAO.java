package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import models.Tessera;
import util.JpaUtils;

public class TesseraDAO {

	
	
public Tessera findTessera(long codiceTessera) {
	    
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        return em.find(Tessera.class, codiceTessera);
	      } finally {
	        em.close();
	      }
	  }
	  
	  public void refreshTessera(Tessera te) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      try {
	        em.refresh(te);
	      } finally {
	        em.close();
	      }
	  }

	  public void saveTessera(Tessera te) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(te);
	        
	        et.commit();
	        
	      } catch (Exception ex) { System.out.println("Non sta funzioanndo");
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }
	  
	  
	  public void deleteTessera(Tessera te) {
	    EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	      EntityTransaction et = em.getTransaction();
	      try {
	        et.begin();
	        
	        em.persist(te);
	        
	        et.commit();
	        
	      } catch (Exception ex) {
	        et.rollback();
	      } finally {
	        em.close();
	      }
	  }


	}
	


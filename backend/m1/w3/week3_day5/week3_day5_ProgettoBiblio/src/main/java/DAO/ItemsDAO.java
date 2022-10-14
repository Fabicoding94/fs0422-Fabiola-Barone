package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import models.Items;

import util.JpaUtils;

public class ItemsDAO {
	
	
public Items findByIdPrestito(long id) {
		
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	return em.find(Items.class, id);
	    } finally {
	    	em.close();
	    }
	}
	
	public void refresh(Items i) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    try {
	    	em.refresh(i);
	    } finally {
	    	em.close();
	    }
	}

	public void save(Items i) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(i);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}
	
	
	public void delete(Items i) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    try {
	    	et.begin();
	    	
	    	em.persist(i);
	    	
	    	et.commit();
	    	
	    } catch (Exception ex) {
	    	et.rollback();
	    } finally {
	    	em.close();
	    }
	}


}

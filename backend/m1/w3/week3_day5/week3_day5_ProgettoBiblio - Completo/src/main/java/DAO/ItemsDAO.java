package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import models.Items;
import models.Libro;
import util.JpaUtils;

public class ItemsDAO {
	
	
	private static final Logger logger = ( Logger ) LoggerFactory.getLogger(ItemsDAO.class);
	
	
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
	
	
	public Items findByISBN(long ISBN) {
		
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
		
	    try {
	    	return em.find(Items.class, ISBN);
	    }  finally {
	    	em.close();
	    }
		
	}
	
	
	public static void deleteISBN(long ISBN) {
		EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
	    
	    try {
	    	
	    	Query q = em.createQuery("SELECT e from Items e WHERE e.isbn = :ISBN");
	    	q.setParameter("ISBN", ISBN);
	    	
	    	Items el = (Items) q.getSingleResult();
	    	
	    	EntityTransaction et = em.getTransaction();
	    	et.begin();
	    	
	    	em.remove(el);
	    	
	    	et.commit();}
	    	catch (Exception ex) {
	            em.getTransaction().rollback();
	            logger.error("Errore durante la rimozione", ex);
	            throw ex;
	        
	    } finally {
	    	em.close();
	    }
	}
	    
	    
	    public static List <Items> findByPublicationYear(int anno) {
	    	
	    	EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
			
		    try {
		    	Query q = em.createQuery("SELECT e from Items e WHERE e.anno = :Anno");
		    	q.setParameter("Anno", anno);
		    	
		    	List<Items> el = q.getResultList();
		    	return el;
		    }  finally {
		    	em.close();
		    }
	    }
		    public static List <Libro> findByAuthor(String autore) {
		    	
		    	EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
				
			    try {
			    	Query q = em.createQuery("SELECT e from Libro e WHERE e.autore = :Autore");
			    	q.setParameter("Autore", autore);
			    	
			    	List<Libro> el = q.getResultList();
			    	return el;
			    }  finally {
			    	em.close();
			    }
		    }
		    
			    public static List <Items> findByTitle(String titolo) {
			    	
			    	EntityManager em = JpaUtils.getEntityManagerFactory().createEntityManager();
					
				    try {
				    	Query q = em.createQuery("SELECT e from Items e WHERE e.titolo = :Titolo");
				    	q.setParameter("Items", titolo);
				    	
				    	List<Items> el = q.getResultList();
				    	return el;
				    }  finally {
				    	em.close();
				    }
	}
			    
			    
			  

}

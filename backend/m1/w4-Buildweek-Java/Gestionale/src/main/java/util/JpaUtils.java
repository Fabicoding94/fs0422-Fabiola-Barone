package util;


	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;


	  
		public class JpaUtils {
		    private static final Logger logger = LoggerFactory.getLogger(JpaUtils.class);

	  private static final EntityManagerFactory entityManagerFactory;

	  static {
	    try {
	      entityManagerFactory = Persistence
	          .createEntityManagerFactory("Gestionale");
	    } catch (Throwable ex) {
	      System.err.println("Initial EntityManagerFactory creation failed."+ ex);
	      throw new ExceptionInInitializerError(ex);
	    }
	  }

	  public static EntityManagerFactory getEntityManagerFactory() {
	    return entityManagerFactory;
	  }

		}
	
	
	


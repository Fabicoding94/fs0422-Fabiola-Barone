package models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence; 
import javax.persistence.Query;

import DAO.RivenditoreAutorizzatoDAO;




public class GestionaleBusiness extends GestionaleGenerico {

	
	
	
public void	controllaItemsPerPeriodo(){
	
	System.out.println("Inserisci la data di inizio nel formato (2016-08-16).");
	scanner.nextLine();
	LocalDate dataInizio = LocalDate.parse(scanner.nextLine());
	System.out.println(dataInizio);
	System.out.println("Inserisci la data di fine nel formato (2016-08-16).");
	LocalDate dataFine = LocalDate.parse(scanner.nextLine());
	System.out.println("Inserisci il luogo di interesse attraverso l'id");
	long m = Long.parseLong(scanner.nextLine());
	RivenditoreAutorizzato mnome = rivenditoreautorizzatodao.findLuogoEmissione(m);
	long n = mnome.getCodiceLuogo();
	List <Object[]> l = GestionaleBusiness.s2Query(dataInizio, dataFine, n);
	System.out.println(l);
	System.out.println("-----------------------------------------------------------------------");
	 for (int i = 0; i < l.size(); i++) {
	        Object[] o = l.get(i);
	       
	        System.out.println("Tipo: " + o[0]);
	        System.out.println("Codice: " + o[1]);
//	        System.out.println("Validita: " + o[2]);
//	        System.out.println("Data: " + o[3]);
//	        System.out.println("Periodicita: " + o[4]);
	        System.out.println("Luogo: " + o[5]);
//	        System.out.println("Tessera: " + o[6]);
//	        System.out.println("Utente: " + o[7]);
	        
	    
	      }
		System.out.println("Nel periodo interessato, sono stati emessi " + l.size() + " titoli di viaggio dal rivenditore" + m);
	}
	
	
//	GestionaleBusiness.s2Query();
	
	public void MetodoScannerBusiness(){
	
		
		
		
		
		
	 boolean a = true;
	 
 	do {
 		
	
	System.out.println();
    System.out.println( "MENU" );
    System.out.println( """
            1. Per controllare l'emissione di abbonamenti e biglietti per periodo e punto emissione.
            2. Per controllare l'obliterazione dei biglietti.
            3. Per controllare lo stato dei mezzi;
            
            
    		""");
    
    try {
	    int sceltaG = scanner.nextInt();

	    switch (sceltaG) {
	        case 1 -> {
	        	System.out.println("Inserisci il periodo che vuoi controllare");
	        	controllaItemsPerPeriodo();
	        	
	        }
	        
	        case 2 -> {
	        	System.out.println("Vuoi sapere quante volte viene effettuata la tratta ogni giorno? Scrivi il numero del mezzo");
	        	
//	        	ControlloValiditaBiglietti();
	        	}
	    
    case 3 -> {
    	System.out.println("Vuoi sapere quante volte viene effettuata la tratta ogni giorno? Scrivi il numero del mezzo");
    	
//    	ControlloStatoMezzi();
    	}
}
}
	catch (Exception e) { 
		e.printStackTrace();
		standardMessage("Inserisci un numero da 1 a 4");
	    
	}
	finally {}
 	
 	
 	
 	}
 	
 	while(a);
	
	}
	
	
	

	
public static void controlloEmissioneBiglietti(){
		

		
		
	}




public static List <Object[]> s2Query(LocalDate inizio, LocalDate fine, long n) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestionale");

    EntityManager em = emf.createEntityManager();

    try {

      Query q = em.createNativeQuery(" SELECT * \r\n"
          + "FROM items " + "WHERE data >= '" + inizio + "' AND data <= '" + fine + "' AND luogo_codiceluogo =  " + n  
          );
      
System.out.println(q);

      List<Object[]> r = q.getResultList();
       System.out.println(r);
      return (r);
     

    } catch (Exception e) {
      e.getMessage();
      return null;
    }
finally {
    em.close();
    emf.close();
  }

}









}

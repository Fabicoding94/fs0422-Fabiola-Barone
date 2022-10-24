package models;

import java.time.LocalDate;

public class GestionaleCliente extends GestionaleGenerico  {
	
	

	
	public void acquistaTitoli(){
		
		
		 boolean c = true;
		 
	    	do {
	    		
	    		System.out.println();
	    	    System.out.println( "MENU" );
	    	    System.out.println( """
	    	            1. Per acquistare biglietti .
	    	            2. Per acquistare abbonamenti.
	    	            
	    	            
	    	    		""");
	    	   

	    	try {
	    	    int scelta = scanner.nextInt();

	    	    switch (scelta) {
	    	        case 1 -> {
	    	        	acquistaBiglietto();
	    	          
	    	        }
	    	        case 2 -> {acquistaAbbonamento();}
	    	       
	    	    }
	    	}
	    	catch (Exception e) {standardMessage("Inserisci numero 1 o 2");
	    	    
	    	}
	    	finally {}



	    	} while( c );

	    	} 
	    
	    
		
	public void acquistaBiglietto(){
		RivenditoreAutorizzato r1 = new RivenditoreAutorizzato ("via di Vigna Stelluti 153", "Da Peppe");
	    rivenditoreautorizzatodao.save(r1);
		Biglietto b20 = new Biglietto(true, r1);
		bigliettodao.save(b20);
	};
	
	public Periodicita getPeriodicita(){
		boolean e = true;
		do {
			standardMessage("Che tipo di periodicità vuoi? Scrivi 1 per la settimanale o 2 per la mensile");
			int n = scanner.nextInt();
			if (n == 1) {return Periodicita.SETTIMANALE;}else {return Periodicita.MENSILE;}
		 
			
		}while(e);
		
	}
	
	public void acquistaAbbonamento(){
		 RivenditoreAutorizzato r1 = new RivenditoreAutorizzato ("via di Vigna Stelluti 153", "Da Peppe");
	    rivenditoreautorizzatodao.save(r1);
	 
	    
	    	standardMessage("Scrivi il tuo codice tessera");
	    	  long p = scanner.nextLong();
	    	  Tessera t = tesseradao.findTessera(p);
	    	  Utente u = t.getUtente();
	    	
	    	  
	    	  
	    	
	    	  Abbonamento a20 = new Abbonamento (true,u,getPeriodicita(), r1, LocalDate.now(),t);
	    	 System.out.println(a20);
	    	  abbonamentodao.save(a20);
	    	  t.setAbbonamento(a20);
	    	  tesseradao.refreshTessera(t);
	    	  
	    
		
	};
		
		
	
	
	
	public static void convalidaTitolo(){};
	public static void ricercaTratta(){};
	
	
	 public void opzioneGestionaleCliente() {
		 
		 
		 
		 boolean a = true;
		 
	    	do {
	    		
	    		System.out.println();
	    	    System.out.println( "MENU" );
	    	    System.out.println( """
	    	            1. Per acquistare biglietti o abbonamenti.
	    	            2. Per controllare la validità del tuo titolo di viaggio.
	    	            0. Per calcolare le tratte;
	    	            
	    	    		""");
	    	   

	    	try {
	    	    int scelta = scanner.nextInt();

	    	    switch (scelta) {
	    	        case 1 -> {
	    	        	acquistaTitoli();
	    	          
	    	        }
	    	        case 2 -> {convalidaTitolo();}
	    	        case 3 -> {ricercaTratta();}
	    	    }
	    	}
	    	catch (Exception e) {standardMessage("Inserisci un numero da 1 a 3");
	    	    
	    	}
	    	finally {}



	    	} while( a );

	    	} 
	    };
	    
	    



package models;

import java.time.LocalDate;
import java.time.Period;

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
		
		
	
	
	
	public void convalidaTitolo(){
		long codiceTessera = scanner.nextLong();
		Tessera t = tesseradao.findTessera(codiceTessera);
		LocalDate inizio = t.getDataEmissione();
		LocalDate fine = LocalDate.now();
		Period diff = Period.between( inizio, fine );
		System.out.println("\n La tua validità:");
        System.out.printf(
        		
         "%n Sono passati " + "%d years, %d months"
                + " and %d days. ",
            diff.getYears(),
            diff.getMonths(),
            diff.getDays());
       
    
		
		if(diff.getYears()==0 && diff.getMonths() <= 12 && diff.getDays() < 30) {
			System.out.println("\n Il tuo titolo di viaggio è valido");
		}
		
  
	};
	public void  NumeroPercorsiGiornalieri(){
		
		long n = scanner.nextLong();
		DurataServizio Servizio = new DurataServizio (500);
		long TempoServizio = Servizio.getTempoServizio();
		Bus bus = busdao.findbus(n);
		Tratta trattaBus = bus.getTratta();
		long TempoTratta = trattaBus.getTempoMedio();
		long NumeroTratte = (TempoServizio / TempoTratta);
		System.out.println("\n\n Il percorso da te selezionato viene effettuato " + NumeroTratte + " volte. Il percorso di ciascuna tratta ha durata " + TempoTratta + " min" );
	};
	
	
	 public void opzioneGestionaleCliente() {
		 
		 
		 
		 boolean a = true;
		 
	    	do {
	    		
	    		System.out.println();
	    	    System.out.println( "MENU" );
	    	    System.out.println( """
	    	            1. Per acquistare biglietti o abbonamenti.
	    	            2. Per controllare la validità del tuo titolo di viaggio.
	    	            3. Per calcolare le tratte;
	    	            
	    	    		""");
	    	   

	    	try {
	    	    int scelta = scanner.nextInt();

	    	    switch (scelta) {
	    	        case 1 -> {
	    	        	acquistaTitoli();
	    	          
	    	        }
	    	        case 2 -> {
	    	        	System.out.println("Inserisci il codice della tua tessera");
	    	        	convalidaTitolo();}
	    	        case 3 -> {
	    	        	System.out.println("Vuoi sapere quante volte viene effettuata la tratta ogni giorno? Scrivi il numero del mezzo");
	    	        	
	    	        	NumeroPercorsiGiornalieri();}
	    	    }
	    	}
	    	catch (Exception e) {standardMessage("Inserisci un numero da 1 a 3");
	    	    
	    	}
	    	finally {}



	    	} while( a );

	    	} 
	    };
	    
	    



package models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import DAO.AbbonamentoDAO;
import DAO.BigliettoDAO;
import DAO.BusDAO;
import DAO.DistributoreAutomaticoDAO;
import DAO.RivenditoreAutorizzatoDAO;
import DAO.TesseraDAO;
import DAO.TramDAO;
import DAO.TrattaDAO;
import DAO.UtenteDAO;

public class PiattaformaUtilizzo extends GestionaleGenerico {
	
	
    

    public void opzioneGestionaleBusiness() {};
    
    GestionaleCliente g = new GestionaleCliente();
   
    


 public void startGestionale(){
    	
    Tessera t1 = new Tessera(LocalDate.now(),true);
    
    Tessera t2 = new Tessera(LocalDate.now(),true);
    
    Tessera t3 = new Tessera(LocalDate.now(),true);
    
    Tessera t4 = new Tessera(LocalDate.now(),true);
    
    Tessera t5 = new Tessera(LocalDate.now(),true);
    
    RivenditoreAutorizzato r1 = new RivenditoreAutorizzato ("via di Vigna Stelluti 153", "Da Peppe");
    rivenditoreautorizzatodao.save(r1); 
    
    Utente u1 = new Utente ();
    u1.setNome("Mario");
//    utentedao.save(u1);
    t1.setUtente(u1);
    t1.setLuogoEmissione(r1);
    u1.setTessera(t1);
    tesseradao.saveTessera(t1);
    
//   
  

    
    
    
    Abbonamento a1 = new Abbonamento (true, u1, Periodicita.SETTIMANALE, r1, LocalDate.now(), t1);
    abbonamentodao.save(a1);
    
    
    Biglietto b1 = new Biglietto (true, r1);
    bigliettodao.save(b1);
  
    
    
 
boolean b = true;

do {
	
	System.out.println();
    System.out.println( "MENU" );
    System.out.println( """
            1. Per accedere al gestionale CLIENTE.
            2. Per accedere al gestionale BUSINESS.
            0. Per uscire premi zero;
            
    		""");
   

try {
    int scelta = GestionaleGenerico.scanner.nextInt();

    switch (scelta) {
        case 0 -> {
            GestionaleGenerico.standardMessage( "ARRIVEDERCI!" );
            b = false;
        }
        case 1 -> { g.opzioneGestionaleCliente();}
        case 2 -> { opzioneGestionaleBusiness();}
    }
}
catch (Exception e) {GestionaleGenerico.standardMessage("Inserisci un numero da 0 a 2");
    
}
finally {}



} while( b );

} 
}    
   

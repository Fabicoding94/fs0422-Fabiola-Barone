package models;

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

public abstract class GestionaleGenerico{
	
	AbbonamentoDAO abbonamentodao = new AbbonamentoDAO();
    BigliettoDAO bigliettodao = new BigliettoDAO();
    UtenteDAO utentedao = new UtenteDAO();
    BusDAO busdao = new BusDAO();
    DistributoreAutomaticoDAO distributoreautomaticodao = new DistributoreAutomaticoDAO();
    RivenditoreAutorizzatoDAO rivenditoreautorizzatodao = new RivenditoreAutorizzatoDAO();
    TesseraDAO tesseradao = new TesseraDAO();
    TramDAO tramdao= new TramDAO();
    TrattaDAO trattadao = new TrattaDAO();
	
	public static Scanner scanner = new Scanner( System.in );
	
	
    protected static void standardMessage( String stringa ) {
        StringBuilder vuota = new StringBuilder( "****" );
        for( String s : stringa.split( "" ) ) {
            vuota.append( "*" );
        }

        System.out.println( vuota );
        System.out.println( "* " + stringa + " *" );
        System.out.println( vuota );
    }
    

}

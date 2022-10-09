package week2_day5_Progetto_CatalogoBibliografico;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Archivio_libri_e_riviste {
	
	    String libriPresenti = "LIBRI: \n";
	    String rivistePresenti = "RIVISTE: \n";

	    public String getlibriPresenti() {
	        setlibriPresenti();
	        return libriPresenti;
	        
	    };

	    public void setlibriPresenti() {
	        String fileName = "docs/Archivio_Libri&Riviste.txt";
	        File Libri_RivisteFile = new File( fileName );
	        String encoding = "UTF-8";
	        
	        if( Libri_RivisteFile.exists() ) {

	            try {
	                String fileContent = FileUtils.readFileToString( Libri_RivisteFile, encoding );

	                this.libriPresenti = fileContent;

	            } catch( IOException e ) {
	                System.out.println( "Error" );
	            }

	        } else {
	            try { // Nel caso in cui non esiste il file, viene creato automaticamente
	                FileUtils.writeStringToFile(Libri_RivisteFile, " ", encoding );
	            } catch( IOException e ) {
	                throw new RuntimeException( e );
	            }
	        }
	    }
	    
	    public void addLibro(Long ISBN, String titolo, String anno, int pagine, String autore, String genere) {
	        String fileName = "docs/Archivio_Libri&Riviste.txt";
	        File Libri_RivisteFile = new File( fileName );
	        String encoding = "UTF-8";

	        try {
	            FileUtils.writeStringToFile( Libri_RivisteFile, ISBN + "-" + titolo + "-" + anno + "-" + pagine + "-" + autore + "-" + genere + "#\n", encoding, true );
	        } catch( IOException e ) {
	            throw new RuntimeException( e );
	        }
	        setlibriPresenti();
	    }
	    
	    
	    //RIVISTE PRESENTI
	    public String getRivistePresenti() {
	        setRivistePresenti();
	        return rivistePresenti;
	        
	    }

	    public void setRivistePresenti() {
	        String fileName = "docs/Archivio_Libri&Riviste.txt";
	        File Libri_RivisteFile = new File( fileName );
	        String encoding = "UTF-8";
	        
	        if( Libri_RivisteFile.exists() ) {

	            try {
	                String fileContent = FileUtils.readFileToString( Libri_RivisteFile, encoding );

	                this.libriPresenti = fileContent;

	            } catch( IOException e ) {
	                System.out.println( "Error" );
	            }

	        } else {
	            try { // Nel caso in cui non esiste il file, viene creato automaticamente
	                FileUtils.writeStringToFile(Libri_RivisteFile, " ", encoding );
	            } catch( IOException e ) {
	                throw new RuntimeException( e );
	            }
	        }
	    }
	    
	    public void addRivista(Long ISBN, String titolo, String anno, int pagine, Periodicità periodicità) {
	        String fileName = "docs/Archivio_Libri&Riviste.txt";
	        File Libri_RivisteFile = new File( fileName );
	        String encoding = "UTF-8";

	        try {
	            FileUtils.writeStringToFile( Libri_RivisteFile, ISBN + "-" + titolo + "-" + anno + "-" + pagine + "-" + periodicità +  "#\n", encoding, true );
	        } catch( IOException e ) {
	            throw new RuntimeException( e );
	        }
	        setRivistePresenti();
	    }

		
	
	
	
	
	
	

}

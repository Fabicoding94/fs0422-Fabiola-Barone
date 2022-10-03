package Esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {
	
	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		calcolaKmLitro();
		
		s.close();
		
	}
	
	public static void calcolaKmLitro() {
		try {
			int km, l;
			System.out.println("Inserire i km");
			km = s.nextInt();
			System.out.println("Inserire i litri");
			l = s.nextInt();
			int kml = km/l;
			System.out.println("Il consumo è di " + kml + "km/l");
		} catch(ArithmeticException e) {
			System.out.println("Valore 0 non accettato");
			calcolaKmLitro();//Eseguo qua il metodo per chiedere nuovamente i dati
		}catch(InputMismatchException e) {
			System.out.println("Input non  valido");
			s.nextLine();//In caso l'errore fosse generato da un input non accettato da nextInt svuoto l'input leggendo "a vuoto" la linea di input salvata
			calcolaKmLitro();
		} catch(Exception e) {
			System.out.println("Altro errore rilevato");
			e.printStackTrace();
			//calcolaKmLitro();
		}
	}

}

package esd3;

public class Esercizid3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(stringaPariDispari("Ciaone"));
		System.out.println(stringaPariDispari("Ciaone,come stai?"));
		
		System.out.println(annoBisestile(2004));
		System.out.println(annoBisestile(1964));
		System.out.println(annoBisestile(2021));

	}
	
	
	
	public static String stringaPariDispari( String stringa) {
		
		
		int x = stringa.length();

		if(stringa.length() % 2 ==0) {
			return("PARI perchè è formata da " +  x + " caratteri");}
		else {
			return("DISPARI perchè è formata da " +  x + " caratteri");
		}
		};
	
	

	public static String annoBisestile( int x) {
	
		if( x % 4 == 0 || (x % 100 ==0 && x % 400 == 0)) {
		return "Anno Bisestile";}
	else {
		return("Anno NON Bisestile");
	}}
	
	
	
		

}



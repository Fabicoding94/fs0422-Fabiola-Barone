package esd3;

public class AnnoBisestile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 1983;
		x = 2004;
		if( x % 4 == 0 || (x % 100 ==0 && x % 400 == 0)) {;
		System.out.println("Anno Bisestile");}
	else {
		System.out.println("Anno NON Bisestile");}

	}

}

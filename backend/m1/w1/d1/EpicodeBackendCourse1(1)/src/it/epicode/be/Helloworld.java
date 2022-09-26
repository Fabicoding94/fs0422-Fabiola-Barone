package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
	// Stampa a console  la frase
	System.out.println("This is my first Epicode Java Project!");
	
	//Moltiplica
	int x = moltiplica (6, 5);
	System.out.println(x);
	
	//Moltiplica
	//println : ti fa andare a capo
		System.out.println(moltiplica (20, 10));
	
	//Concatenazione
	String frase = concatena("Fabiola", 28);
	System.out.println(frase);
	
	//String[] arr = {"a", "b", "c", "d", "e" };
	String[] newArr = inserisci(new String[]{"a", "b", "c","d", "e"}, "f");
	System.out.print("newArr: ");
	System.out.println(newArr);
	System.out.println(newArr[2]);
	
	
	
		
		}

public static int moltiplica(int n1, int n2) {
	return n1 * n2;
}

public static String concatena(String s, int n) {
	return "Ciao mi chiamo " + s + " ed ho " + n + " anni" ;
}
 
public static String[] inserisci (String[] arr, String s) {
	/*String [] res = new String[6];
	res [0] = arr[0];
	res [1] = arr[1];
	res [2] = s;
	res [3] = arr[2];
	res [4] = arr[3];
	res [5] = arr[4];*/
	String[] res = {arr[0], arr[1], s, arr[2], arr[3], arr[4]};
	
	return res;
	
}

}







package Esercizio1_w2d1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
	
	public static void main(String[] args) {
		int[] arr = creaArray();
		printArray(arr);
		inputUtente(arr);
	}
	
	private static int[] creaArray() {
		int[] a = new int[5];
		Random randomGenerator = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = randomGenerator.nextInt(11);
		}
		return a;
	}
	
	private static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println("- " + a[i]);
		}
	}
	
	private static void inputUtente(int[] arr) {
		Scanner s = new Scanner(System.in);
		int pos, val;
		boolean end = true;
		do {
			try {
				System.out.println("Inserire la posizione 1-5");
				pos = s.nextInt();
				System.out.println("Inserire il valore");
				val = s.nextInt();
				if(pos == 0) {
					end = false;
				} else {
					try {
						arr[pos-1] = val;
						printArray(arr);
					} catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("La posizione inserita non è valida");
					}
				}
			}catch(InputMismatchException e) {
				System.out.println("Input non valido");
				//e.printStackTrace();
				s.nextLine();
			}
		} while(end);
	}

}
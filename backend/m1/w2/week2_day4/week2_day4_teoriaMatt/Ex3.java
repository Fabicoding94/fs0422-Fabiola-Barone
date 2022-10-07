package week2_day4;

import java.util.function.Predicate;
import java.util.function.Function;

public class Ex3 {

	public static void main(String[] args) {
		
		// Predicate
		// implementazioni
		Predicate<Integer> greaterThanZero = (n) -> n > 0;
		Predicate<Integer> isEven = (n) -> n % 2 == 0;
		Predicate<String> startsWithA = (s) -> s.charAt(0) == 'a';

		// utilizzi
		System.out.println( greaterThanZero.test(10) );
		System.out.println( greaterThanZero.test(-10) );
		System.out.println( "armadillo inizia con la 'a'? " + startsWithA.test("armadillo") );
		
		int number = 33;
		System.out.println( number + " è > 0 e pari? " + greaterThanZero.and(isEven).test(number) );
		System.out.println( number + " è > 0 oppure pari? " + greaterThanZero.or(isEven).test(number) );
		
		if( number > 0 && number % 2 == 0 ) {
			// ...
		}
		
		tests( isEven, 8 );
		tests( (n) -> n % 2 != 0, 3 );
		
		// Function
		// implementazioni
		Function<String, Integer> fn1 = (s) -> s.length();
		Function<Integer, Integer> fn2 = (n) -> n * 2;
				
		// utilizzi
		System.out.println( "la lunghezza della stringa è: " + fn1.apply("java") );
		applyFn( fn1, "java" );
		applyFn( (s) -> s.length() + 10, "java" );
		
		tests( s -> s.length() + 100, "java" );
		tests( n -> n + 10 > 0, 100 );
		
		System.out.println( "la lunghezza della stringa raddoppiata è: " + fn1.andThen(fn2).apply( "java" ) );
		
	}
	
	// Predicate<E>  test(E el)
	public static void tests(Predicate<Integer> testType, int n) {
		System.out.println( "risultato: " + testType.test(n) );
	}
	
	public static void tests(Function<String, Integer> fn, String s) {
		System.out.println( "applyFn: " + fn.apply(s) );
	}
	
	public static void applyFn(Function<String, Integer> fn, String s) {
		System.out.println( "applyFn: " + fn.apply(s) );
	}

}

package week2_day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {
	
	public static void sep() { System.out.println("--------------------------"); }

	public static void main(String[] args) {
		
		// generazione stream a partire da array nativo
		Stream<String> s1 = Arrays.stream( 
			new String[] { "prima parola", "seconda parola", "terza parola" } 
		);
		
		s1.forEach( System.out::println );
		
		sep();
		// generazione stream tramite stream builder
		Stream<String> s2 = Stream.<String>builder()
							.add("epicode")
							.add("java")
							.add("back-end")
							.build();
		
		s2.forEach(( el ) -> System.out.println( "l'elemento è: " + el ));
		
		sep();
		// generazione tramite generate
		Stream.generate( () -> "elemento" )
			.limit(3)
			.forEach( el -> System.out.println(el) );
		
		sep();
		Stream.iterate(1, n -> n + 1)
			  .limit(10)
			  .forEach( System.out::println );
		
		sep();
		// generazione tramite lista
		List<String> words = new ArrayList<>(Arrays.asList("epicode", "java", "back-end"));
		Stream<String> s3 = words.stream();
		s3
			.filter( s -> s.charAt(0) == 'j' )
			.forEach( s -> System.out.println( "el: " + s ) );
		
		sep();
		List<Student> students = new ArrayList<>(Arrays.asList(
				new Student("mario", new int[] {8, 6, 8, 9}),
				new Student("luigi", new int[] {3, 4, 2, 5}),
				new Student("daisy", new int[] {9, 6, 6, 7}),
				new Student("yoshi", new int[] {2, 2, 4, 5})
		));
		
		System.out.println( "studenti promossi:" );
		students.stream()
			.filter( st -> st.getAvg() >= 6 )
			.forEach( st -> System.out.print( st + " " ) );
		
		
		System.out.println();
		sep();
		// generazione tramite lista
		List<String> words2 = new ArrayList<>(Arrays.asList("epicode", "java", "back-end"));
		Stream<String> s4 = words2.stream();
		s4
			.map( s -> s.toUpperCase() )
			.filter( s -> s.charAt(0) == 'J' )
			.forEach( s -> System.out.println( "el: " + s ) );
		
		
	}

}

class Student {
	String name;
	int[] votes;
	
	Student(String name, int[] votes) {
		this.name = name;
		this.votes = votes;
	}
	
	double getAvg() {
		double sum = 0;
		for(int i = 0; i < this.votes.length; i++) {
			sum += this.votes[i];
		}
		return sum / this.votes.length;
	}
	
	@Override
	public String toString() {
		return this.name + "(" + this.getAvg() + ")";
	}
}

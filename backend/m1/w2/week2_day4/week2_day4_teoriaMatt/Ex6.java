package week2_day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex6 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>(Arrays.asList("epicode", "java", "back-end"));
		
		boolean allElementsContainsA = words.stream().allMatch( s -> s.contains("a") );
		System.out.println( allElementsContainsA );
		
		System.out.println( 
			Stream.<Integer>builder()
					.add(10)
					.add(5)
					.add(100)
					.build()
					.noneMatch(n -> n < 0)
		 );
		
		System.out.println( 
			Stream.<Integer>builder()
					.add(10)
					.add(5)
					.add(100)
					.build()
					.anyMatch(n -> n < 0)
		 );
		
		Predicate<Student> promosso = s -> s.getAvg() > 6;
		Predicate<Student> bocciato = s -> s.getAvg() < 6;
		
		System.out.println( 
				"qualche studente è bocciato? " +
				
				Stream.<Student>builder()
				.add(new Student("mario", new int[] {8, 6, 8, 9}))
				.add(new Student("luigi", new int[] {3, 4, 2, 5}))
				.add(new Student("daisy", new int[] {9, 6, 6, 7}))
				.add(new Student("yoshi", new int[] {2, 2, 4, 5}))
				.build()
				.anyMatch(bocciato)
		 );
					
		
	}

}

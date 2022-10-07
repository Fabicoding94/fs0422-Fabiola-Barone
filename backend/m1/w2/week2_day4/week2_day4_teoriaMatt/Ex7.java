package week2_day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>(Arrays.asList(5, 4, 10, 5));
		System.out.println( nums.stream().reduce(0, (currentValue, el) -> currentValue + el ) );
		
		List<String> words = new ArrayList<>(Arrays.asList("mela", "banana", "kiwi", "mandarino"));
		System.out.println( words.stream().reduce("valore iniziale", 
					(currentValue, el) -> currentValue + " | " + el ) + " | end" );

		List<Student> students = new ArrayList<>(Arrays.asList(
				new Student("mario", new int[] {8, 6, 8, 9}),
				new Student("luigi", new int[] {3, 4, 2, 5}),
				new Student("daisy", new int[] {9, 6, 6, 7}),
				new Student("yoshi", new int[] {2, 2, 4, 5})
		));
		
		
		students
			.stream()
			.map( s -> s.votes[0] )
			.collect( Collectors.toCollection(ArrayList::new) )
			/*.add( 10 )
			.add(20) */
			.forEach( v -> System.out.println(v) );
		
		System.out.println(words.stream().collect( Collectors.joining(" | ", "**", "**") ));
		
		
	}

}

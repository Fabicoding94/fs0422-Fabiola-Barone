package week2_day4;

@FunctionalInterface
interface StringOperation {
	String start( String s );
}

@FunctionalInterface
interface ArrayOperation {
	int[] start( int n );
}

public class Ex2 {

	public static void main(String[] args) {
		
		// implementazioni
		StringOperation uc = (s) -> s.toUpperCase();
		StringOperation lc = (s) -> s.toLowerCase();
		StringOperation reverse = (s) -> {
			String s2 = "";
			for(int i = s.length() - 1; i >= 0; i--) {
				s2 += s.charAt(i);
			}
			
			return s2;
		};
		
		ArrayOperation a1 = (n) -> new int[n];
		
		int[] numbers = a1.start(10);
		System.out.println( java.util.Arrays.toString(numbers) );
		
		// utilizzo
		System.out.println( uc.start("java") );
		doStringOperation( uc, "java" );
		doStringOperation( lc, "jAvA" );
		doStringOperation( reverse, "jAvA" );

	}
	
	public static void doStringOperation(StringOperation op, String s) {
		System.out.println( op.start(s) );
	}

}

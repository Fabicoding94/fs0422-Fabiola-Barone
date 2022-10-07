package week2_day4;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		Shape s = new Rectangle();
		printAreaOfShape(s, 10, 5);
		*/
		
		printAreaOfShape(new Shape() {
			@Override
			public void printArea(int x, int y) {
				System.out.println( "l'area è: " + (x * y) );
			}
		}, 10, 5);
		
		printAreaOfShape(new Shape() {
			@Override
			public void printArea(int x, int y) {
				System.out.println( "area is: " + (x * y) );
			}
		}, 4, 6);

	}
	
	public static void printAreaOfShape(Shape s, int x, int y) {
		s.printArea(x, y);
	}

}

interface Shape {
	public abstract void printArea(int x, int y);
}

/*
class Rectangle implements Shape {
	@Override
	public void printArea(int x, int y) {}
}
*/
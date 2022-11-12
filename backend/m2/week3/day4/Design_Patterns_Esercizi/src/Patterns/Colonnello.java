package Patterns;

public class Colonnello extends Carabiniere {

	public Colonnello() {
		setStipendio(1000);
		
	}
	
	@Override
	public void testStipendio(int s) {
		if(this.getStipendio()>=s){
			System.out.println("")
		}
	}

}

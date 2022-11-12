package Patterns;

public class Capitano extends Carabiniere {

	public Capitano() {
		setStipendio(1000);
		
	}
	
	@Override
	public void testStipendio(int s) {
		if(this.getStipendio()>=s){
			System.out.println("")
		}
	}
	
	

}

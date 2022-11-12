package com.GestioneIncendi.GestioneIncendi.models;

public class CentroDiControllo implements Observer{

	private Long id;
	
	  private LineaDiControllo ln = new LineaDiControllo();
	  
	  public CentroDiControllo(Long id) {
	    this.id = id;
	  }
	  
	  private void inviaMessaggio(Sonda s) {
		 ln.inviaSegnale(s);
	  }
	  
	 public CentroDiControllo(){};

	@Override
	public void update(Subject sub) {
		
			ln.inviaSegnale((Sonda)sub);
			
		
		
	}


	 
}

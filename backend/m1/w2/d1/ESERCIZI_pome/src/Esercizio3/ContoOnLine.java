package Esercizio3;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	@Override
	void preleva(double x) throws BancaException {
		/*
		if(x > maxPrelievo) {
			throw new BancaException("il prelievo non è disponibile");
		}
		saldo = saldo - x;*/
		//super.preleva(x);
		if (x <= maxPrelievo) {
			super.preleva(x);
		} else {
			throw new BancaException("il prelievo non è disponibile");
		}
	}
}
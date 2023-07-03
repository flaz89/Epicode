package Esercizio3;

public class ContoOnline extends ContoCorrente {

	double maxPrelievo;

	ContoOnline(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
		// TODO Auto-generated constructor stub
	}
	

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) {
		if (x <= maxPrelievo) {
			super.preleva(x);
		}
	}
}

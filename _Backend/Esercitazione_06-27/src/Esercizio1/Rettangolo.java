package Esercizio1;

public class Rettangolo {
	
	double altezza;
	double larghezza;
	

	public Rettangolo (double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public double area() {
		return this.altezza * this.larghezza; 
	}
	
	public double perimetro() {
		return (this.altezza + this.larghezza) * 2;
	}
	
}

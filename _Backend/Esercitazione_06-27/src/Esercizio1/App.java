package Esercizio1;

public class App {

	public static void main(String[] args) {
		
		Rettangolo parallelepipedo1 = new Rettangolo(3.1, 2.1);
		Rettangolo parallelepipedo2 = new Rettangolo(4.3, 3.6);
		
		
		stampaRettangolo(parallelepipedo1);
		
		System.out.println();
		
		stampaDueRettangoli(parallelepipedo1, parallelepipedo2);
		
		
	}
	
	public static void stampaRettangolo(Rettangolo ret1) {
		System.out.println("Rettangolo - 1");
		System.out.println("Area: " + ret1.area() + " mq");
		System.out.println("Perimetro:" + ret1.perimetro() + " mt");
	}

	
	public static void  stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
		
		System.out.println("Rettangolo - 1");
		System.out.println("Area: " + ret1.area() + " mq");
		System.out.println("Perimetro:" + ret1.perimetro() + " mt");
		
		System.out.println();
		
		System.out.println("Rettangolo - 2");
		System.out.println("Area: " + ret2.area() + " mq");
		System.out.println("Perimetro:" + ret2.perimetro() + " mt");
		
		double sommaArea = ret1.area() + ret2.area();
		double sommaPerimetro = ret1.perimetro() + ret2.perimetro();
		
		System.out.println();

		System.out.println("La somma delle due aree equivale a: " + sommaArea + " mq" );
		System.out.println("La somma dei due perimetri equivale a: " + sommaPerimetro + " mt" );
	}
}

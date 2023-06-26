import java.util.Scanner;



public class Esercizio4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il valore dei due lati del parallelepipedo:");
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		System.out.println("Il perimetro del tuo parallelepipedo è di: "+ perimetroRettangolo(num1, num2));
		
		System.out.println("Inserisci un numero intero:");
		String num3 = input.nextLine();
		System.out.println(pariDispari(num3));
		
		System.out.println("Inserisci 3 valori dei 3 lati di un triangolo:");
		double l1 = input.nextDouble();
		double l2 = input.nextDouble();
		double l3 = input.nextDouble();
		System.out.println("L'area del tuo triangolo è di " + perimetroTriangolo(l1, l2, l3));
		
		input.close();
	}
	
	public static double perimetroRettangolo(String num1, String num2) {
		double perimetro = (Double.parseDouble(num1) + Double.parseDouble(num2)) * 2;
		return perimetro;
	}
	
	public static String pariDispari(String num) {
		if (Integer.parseInt(num) % 2 == 0 ) {
			return "Il numero scelto è pari";
		} else {
			return "Il numero scelto è dispari";
		}
	}
	
	public static double perimetroTriangolo(double l1, double l2, double l3) {
		double s = (l1 +l2 + l3) / 2;
		double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
		return area;
	}
}

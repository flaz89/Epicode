package Esercizio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    double km = 0;
	    boolean isValidKm = false;
	    while (!isValidKm) {
	        System.out.print("Quanti chilometri hai percorso? ");
	        if (input.hasNextDouble()) {
	            km = input.nextDouble();
	            isValidKm = true;
	        } else {
	            System.out.println("Valore non valido per i chilometri. Riprova.");
	            input.next(); 
	        }
	    }

	    double lt = 0;
	    boolean isValidLt = false;
	    while (!isValidLt) {
	        System.out.print("Quanti litri di benzina hai consumato? ");
	        if (input.hasNextDouble()) {
	            lt = input.nextDouble();
	            isValidLt = true;
	        } else {
	            System.out.println("Valore non valido per i litri di benzina. Riprova.");
	            input.next(); //
	        }
	    }

	    kmLitro(km, lt);
	}

// ---------------------------------------------------
	public static void kmLitro (double km, double lt) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		try {
			
			double result = km / lt;
			
			if (Double.isInfinite(result) || Double.isNaN(result)) {
				throw new ArithmeticException();
			} else {
				System.out.println("Hai fatto: " + df.format(result) + " km per litro di benzina.");
			}
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Non è possibile effettuare una divisione per 0");
		}
	}
}

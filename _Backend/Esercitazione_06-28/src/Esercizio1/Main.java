package Esercizio1;

import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String inputString = input.nextLine();
		
		StringOddEven nuovaStringa = new StringOddEven(inputString);
		System.out.println(nuovaStringa.check());
		
		System.out.println("Inserisci un anno e ti diro se è bisestile:");
		int inputYear = input.nextInt();
		
		AnnoBisestile anno = new AnnoBisestile(inputYear);
		System.out.println(anno.check());
		
	}
}

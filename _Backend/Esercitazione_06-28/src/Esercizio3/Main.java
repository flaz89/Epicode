package Esercizio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
			
		while(true) {
			System.out.println("Inserisci una parola o inserisci la lettera 'q' per uscire dal programma:");
			String word = input.nextLine();
			StringLoop separaLaStringa = new StringLoop(word);
			
			if(word.equals("q")) {
				input.close();
				break;
			} else {
				separaLaStringa.separate();
			}
		}
	}

}

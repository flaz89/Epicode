package Esercizio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		// array vuoto di 5 posizioni
		int numArr[] = new int[5];
		
		// ciclo l'array per generare numeri casuali
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 0) {
				numArr[i] = casualNumbers();
			}
		}
		
		System.out.println("Dato questo array di numeri interi sceglierai un numero che va da 1 a 10 e lo sostituirai con uno dei 5 numeri. (0 per uscire dal programma)");
		printArr(numArr);
		
		
		// loop del programma
		while (true) {
			try {
				System.out.print("Scegli un numero che va da 1 a 10: ");
				int number = input.nextInt();
				
				if ( number == 0) {
					
					input.close();
					break;
					
				} else if (number >= 1 && number <= 10) {
					
					System.out.print("Seleziona una posizione dell'array (da 1 a 5) con cui sostituire il numero scelto precedentemente: ");
					int position = input.nextInt();
					try {
						if (position >= 1 && position <= 5) {
							numArr[position - 1] = number;
							printArr(numArr);
						} else {
							System.out.println("Inserisci un numero corretto");
						}
					} catch (Exception e) {
						System.out.println("Inserisci un valore valido! " + e.getMessage());
						continue;
					}
					
				} else {
					System.out.println("il numero non è corretto");
				}
			} catch (Exception e) {
				System.out.println("Inserisci un valore valido! " + e.getMessage());
				input.nextLine();
			}
			
		}
	
		
		
	}
	//----------------------------------------------------
	
	// metodo che genera numeri casuali
	public static int casualNumbers() {
		return (int) (Math.floor(Math.random() * 10) + 1);
	}
	
	//metodo che stampa l'array di numeri casuali
	public static void printArr(int arr[]) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
		System.out.println("]");
	}

}

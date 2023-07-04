package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Set<Word> setWords = new HashSet <Word>();
		Set<Word> repeatedWords = new HashSet<Word>();
		Set<Word> uniqueWords = new HashSet<>();
		
		
		System.out.println("Inserisci un numero intero che identifiche il numero di parole da inserie: ");
		int numWords = input.nextInt();
		input.nextLine();
		
		// loop di iterazione per il numero di parole da inserire nell'hashset
		for (int i = 0; i < numWords; i++) {
			System.out.println("[" + (i + 1) + "] " +"Quale parola vuoi inserire?");
			String inputWord = input.nextLine();
			Word word = new Word(inputWord);
			
			if (!setWords.add(word)) {
                repeatedWords.add(word);
            }
			
			uniqueWords.add(word);
		}
		
        System.out.println("-----------------------");
		
		// loop per verificare la ripetizione delle parole uguali
		System.out.println("Parole ripetute:");
        for (Word word : repeatedWords) {
            System.out.println(word);
        }
        
        System.out.println("-----------------------");
        
     // loop per verificare le parole distinte
        System.out.println("N° Parole distinte: " + uniqueWords.size());
        System.out.println("Parole distinte:");
        for (Word word : uniqueWords) {
            System.out.println(word);
        }
	}
// ---------------------------------------------
}

import java.util.Scanner;

public class Esercizio3 {
	
 public static void main(String[] args) {
	 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Inserisci 3 parole");
	String word1 = input.nextLine();
	String word2 = input.nextLine();
	String word3 = input.nextLine();
	
	input.close();
	
	System.out.println(word1 + word2 + word3);
	System.out.println(word3 + word2 + word1);
}
}

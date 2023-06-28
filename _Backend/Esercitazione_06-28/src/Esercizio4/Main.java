package Esercizio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		int num = input.nextInt();
		
		Countdown count = new Countdown(num);
		
		count.countdown();
		input.close();
	}

}

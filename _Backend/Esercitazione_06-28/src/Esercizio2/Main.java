package Esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scrivi un numero che va da 0 a 3:");
		int num = input.nextInt();
		
		NumChar test = new NumChar(num);
		test.check();
		input.close();
	}

}

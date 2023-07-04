package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		boolean randomTF = Math.random() > 0.5;
		
		
	while(true ) {
		try {
			System.out.println("Inserisci un numero da 0 a 100: ");
			num = input.nextInt();
			
			if (num < 0 || num > 100) {
	            throw new IllegalArgumentException("Il numero deve essere compreso tra 0 e 100.");
	        }
			break;
		} catch (Exception e) {
			System.err.println("Inserisci un valore corretto");
			input.nextLine();
		}
		
	}
	
	
	ArrayList<Integer> firstArray = generateRandomNumbers(num);
	
	
	ArrayList<Integer> finalArray = reversedList(firstArray);
	
	
	System.out.println(randomTF);
	printArray(finalArray, randomTF);	
		
	}
	
	// ------------------------------------------------------------------------
	
	 public static ArrayList<Integer> generateRandomNumbers(int N) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        Random random = new Random();
	        
	        for (int i = 0; i < N - 1; i++) {
	            int randomNumber = random.nextInt(101); // Genera un numero casuale da 0 a 100
	            numbers.add(randomNumber);
	        }
	        
	        return numbers;
	    }
	 
	 
	 public static ArrayList<Integer> reversedList(ArrayList<Integer> list) {
		 ArrayList<Integer> newList = new ArrayList<Integer>(list);
		 Collections.reverse(newList);
		 
		
		 ArrayList<Integer> concatenatedList = new ArrayList<>(list);
		  concatenatedList.addAll(newList);
		    
		 for (int i = 0; i < concatenatedList.size(); i++) {
	            System.out.print(concatenatedList.get(i) + " ");
	        }
		 System.out.println();
		 
		 return concatenatedList;
		}
	 
	 
	 public static void printArray(ArrayList<Integer> arr, boolean x) {
		 System.out.println();
		 if (x == true) {
			for (int i = 0; i < arr.size(); i+=2) {
				System.out.print(arr.get(i) + " ");
			} 
		 } else {
			 for (int i = 1; i < arr.size(); i+=2) {
					System.out.print(arr.get(i)+ " ");
				} 
		 }
	 }

}

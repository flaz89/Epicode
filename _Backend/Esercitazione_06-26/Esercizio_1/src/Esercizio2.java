import java.util.Arrays;

public class Esercizio2 {
	public static void main(String[] args) {
		
		int moltiplicazione = multiply(9, 7);
		System.out.println(moltiplicazione);
		
		String concatena = concatenate("Giorno", 1);
		System.out.println(concatena);
		
		String[] baseArr = {"Ferrari", "Lamborghini", "Gumpert", "BMW", "Rolls"};
		String[] sixArr = inserisciInArray(baseArr, "Mercedes");
		System.out.println(Arrays.toString(sixArr));
		
		
	}
	
	
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static String concatenate(String str1, int str2) {
		return str1 + str2;
	}
	
	public static String[] inserisciInArray(String arr[], String str ) {
		
		String[] newArr = new String [6];
		
		newArr[0] = arr[0];
		newArr[1] = arr[1];
		newArr[2] = str;
		newArr[3] = arr[2];
		newArr[4] = arr[3];
		newArr[5] = arr[4];
		
		return newArr;
	}
}


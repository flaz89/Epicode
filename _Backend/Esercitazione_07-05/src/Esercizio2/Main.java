package Esercizio2;

public class Main {

	public static void main(String[] args) {
		
		int randomArr[] = new int[3000];
		randomNumArr(randomArr);
		
		int totalSum;

		int start1 = 0;
		int end1 = (randomArr.length / 3);
		CountSum t1 = new CountSum(randomArr, start1, end1);
		
		int start2 = randomArr.length / 3;
		int end2 = 2 * (randomArr.length / 3);
		CountSum t2 = new CountSum(randomArr, start2, end2);
		
		int start3 = 2 * (randomArr.length / 3);
		int end3 = randomArr.length;
		CountSum t3 = new CountSum(randomArr, start3, end3);
		
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		totalSum = t1.getPartialSum() + t2.getPartialSum() + t3.getPartialSum();
		System.out.println(totalSum);
		
//		for (int i = 0; i < end1; i++) {
//			System.out.print(randomArr[i] + " ");
//		}
//		for (int i = start2; i < end2; i++) {
//			System.out.print(randomArr[i] + " ");
//		}
//		for (int i = start3; i < end3; i++) {
//			System.out.print(randomArr[i] + " ");
//		}
		
	
	}
//--------------------------------------------------
	
	// metodo per generare l'array di numeri casuali
	static public void randomNumArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.floor(Math.random() * 5) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}

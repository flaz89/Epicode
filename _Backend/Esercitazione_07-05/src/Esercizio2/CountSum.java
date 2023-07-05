package Esercizio2;

public class CountSum extends Thread{
	int arr[];
	int startIndex;
	int finishIndex;
	int partialSum;
	
	public CountSum(int _arr[], int start, int end) {
		this.arr = _arr;
		this.startIndex = start;
		this.finishIndex = end;
	}
	
	@Override
	public void run() {
		for (int i = this.startIndex; i < this.finishIndex; i++) {
			this.partialSum += this.arr[i];
		}
		System.out.println("Sum: " + this.partialSum);
	}

	public int getPartialSum() {
		return partialSum;
	}
	
	
}

package Esercizio4;

public class Countdown {
	int num;
	
	public Countdown(int _num) {
		this.num = _num;
	}
	
	public void countdown() {
		for (int i = this.num; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

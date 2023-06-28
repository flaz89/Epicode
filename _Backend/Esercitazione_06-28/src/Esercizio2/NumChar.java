package Esercizio2;

public class NumChar {
	int num;
	
	public NumChar(int _num) {
		this.num = _num;
	}
	
	public void check() {
		
		switch (this.num) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("due");
				break;
			case 3:
				System.out.println("tre");
				break;
			default:
				System.out.println("Sucami ma il numero non è riconosciuto");
		}
	}
}

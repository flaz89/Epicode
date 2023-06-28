package Esercizio3;

public class StringLoop {
	String str;
	
	public StringLoop(String _str) {
		this.str = _str;
	}
	
	public void separate() {
		for (int i = 0; i < this.str.length(); i++) {
			System.out.print(this.str.charAt(i) + " ");
		}
		System.out.println();
	}
}

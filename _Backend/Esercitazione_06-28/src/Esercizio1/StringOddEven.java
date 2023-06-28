package Esercizio1;

public class StringOddEven {
	
	String value;
	
	public StringOddEven(String _value) {
		this.value = _value;
	}
	
	public boolean check() {
		return this.value.length() % 2 == 0 ? true : false;
	}
	
}

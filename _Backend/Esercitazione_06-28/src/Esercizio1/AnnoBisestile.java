package Esercizio1;

public class AnnoBisestile {
	int year;
	
	public AnnoBisestile(int _year) {
		this.year = _year;
	}
	
	public boolean check() {
	    return (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0));
	}

}

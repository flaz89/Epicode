package assets;

import java.time.LocalDate;

public class Magazine extends BookMagBlueprint {
	private Periodicity peridiocity;
	
	public Magazine(String _title, int _date, int _pages, Periodicity _peridiocity) {
		super(_title, _date, _pages);
		
		this.peridiocity = _peridiocity;
		
	}

	public Periodicity getPeridiocity() {
		return peridiocity;
	}

	public void setPeridiocity(Periodicity peridiocity) {
		this.peridiocity = peridiocity;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "[peridiocity] = " + peridiocity;
	}
	
	
}

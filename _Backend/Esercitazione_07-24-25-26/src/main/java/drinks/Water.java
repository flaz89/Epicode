package drinks;

public class Water extends Drink{

	@Override
	public String getName() {
		return "Acqua";
	}

	@Override
	public double price() {
		return 1.29;
	}

	@Override
	public double calories() {
		return 0;
	}
	
}

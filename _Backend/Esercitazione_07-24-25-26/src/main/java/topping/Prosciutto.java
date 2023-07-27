package topping;

public class Prosciutto extends Topping {
	
	@Override
	public double price() {
		return 0.99;
	}

	@Override
	public double calories() {
		return 35;
	}

	@Override
	public String getName() {
		return "Prosciutto";
	}
}

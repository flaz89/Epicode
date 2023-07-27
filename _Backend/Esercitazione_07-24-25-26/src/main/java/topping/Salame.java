package topping;

public class Salame extends Topping {
	
	@Override
	public double price() {
		return 0.79;
	}

	@Override
	public double calories() {
		return 99;
	}

	@Override
	public String getName() {
		return "Salame";
	}
}

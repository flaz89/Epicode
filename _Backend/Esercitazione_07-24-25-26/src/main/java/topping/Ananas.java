package topping;

public class Ananas extends Topping {
	
	@Override
	public double price() {
		return 0.79;
	}

	@Override
	public double calories() {
		return 24;
	}

	@Override
	public String getName() {
		return "Ananas";
	}
}

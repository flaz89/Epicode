package topping;

public class Cipolla extends Topping {
	
	@Override
	public double price() {
		return 0.69;
	}

	@Override
	public double calories() {
		return 22;
	}

	@Override
	public String getName() {
		return "Cipolla";
	}
}

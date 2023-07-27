package topping;

public class Mozzarella extends Topping {
	
	@Override
	public double price() {
		return 0.69;
	}

	@Override
	public double calories() {
		return 92;
	}

	@Override
	public String getName() {
		return "Mozzarella";
	}
}

package drinks;

public class Wine extends Drink{

	@Override
	public String getName() {
		return "Vino";
	}

	@Override
	public double price() {
		return 7.49;
	}

	@Override
	public double calories() {
		return 607;
	}
	
}

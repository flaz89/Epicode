package drinks;

public class Lemonade extends Drink{

	@Override
	public String getName() {
		return "Limonata";
	}

	@Override
	public double price() {
		return 1.29;
	}

	@Override
	public double calories() {
		return 128;
	}
	
}

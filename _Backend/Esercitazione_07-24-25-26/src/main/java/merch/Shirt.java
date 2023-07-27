package merch;

public class Shirt extends Product {

	@Override
	public String getName() {
		return "Shirt";
	}

	@Override
	public double price() {
		return 21.99;
	}
	
}

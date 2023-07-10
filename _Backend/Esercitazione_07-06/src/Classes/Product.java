package Classes;

public class Product {
	
	long id;
	String name;
	String category;
	double price;
	
	public Product(long _id, String _name, String _category, double _price) {
		this.id = _id;
		this.name = _name;
		this.category = _category;
		this.price = _price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}

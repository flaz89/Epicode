import java.util.ArrayList;
import java.util.List;

import Classes.Product;

public class Main {

	public static void main(String[] args) {
		
		long randomID = (long) Math.floor(Math.random() * 1000000000);
		
		ArrayList<Product> prodArray = new ArrayList<Product>();
		
		Product prod1 = new Product(randomID, "Il Signore degli Anelli", "Book", 103);
		Product prod2 = new Product(randomID, "Dartagnan", "Book", 44);
		Product prod3 = new Product(randomID, "La Bibbia", "Book", 1000);
		Product prod4 = new Product(randomID, "Topolino", "Book", 12);
		Product prod5 = new Product(randomID, "Iphone 25", "Technology", 800);
		Product prod6 = new Product(randomID, "Asus A80-7", "Technology", 103);
		Product prod7 = new Product(randomID, "Kawasaky Ninja ZX-R", "Mothorbike", 10000);
		
		prodArray.add(prod1);
		prodArray.add(prod2);
		prodArray.add(prod3);
		prodArray.add(prod4);
		prodArray.add(prod5);
		prodArray.add(prod6);
		prodArray.add(prod7);
		
		
		
	}

}

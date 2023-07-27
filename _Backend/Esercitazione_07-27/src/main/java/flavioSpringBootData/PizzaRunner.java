package flavioSpringBootData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dao.IpizzaDAO;
import pizza.PizzaBase;

@Component
public class PizzaRunner implements CommandLineRunner {
	
	@Autowired
	private IpizzaDAO pizzaDAO;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PizzaBase margherita = new PizzaBase();
		System.out.println(margherita);
		pizzaDAO.save(margherita);
	}

}

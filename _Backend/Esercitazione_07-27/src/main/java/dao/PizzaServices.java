package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pizza.PizzaBase;

@Service
public class PizzaServices implements IpizzaDAO {
	
	@Autowired
	private PizzaRepository pizzaRepo;

	@Override
	public void save(PizzaBase pizza) {
		pizzaRepo.save(pizza);
		System.out.println("La pizza selezionata è stata salvata correttamente: " + pizza.getName());
	}

	@Override
	public void removePizzaById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePizzaById(PizzaBase pizza, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPizzaById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PizzaBase> listaPizze() {
		// TODO Auto-generated method stub
		return null;
	}

}

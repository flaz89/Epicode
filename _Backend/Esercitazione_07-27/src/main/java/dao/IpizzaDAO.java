package dao;

import pizza.PizzaBase;

import java.util.List;

import org.springframework.stereotype.Component;

public interface IpizzaDAO {
	
	public void save(PizzaBase pizza);
	
	public void removePizzaById(int id);
	
	public void updatePizzaById(PizzaBase pizza, int id);
	
	public void getPizzaById(int id);
	
	public List<PizzaBase> listaPizze();

}

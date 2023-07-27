package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pizza.PizzaBase;


@Repository
public interface PizzaRepository extends JpaRepository<PizzaBase, Integer> {

}

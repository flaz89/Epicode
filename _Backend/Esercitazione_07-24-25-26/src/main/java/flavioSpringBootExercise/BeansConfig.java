package flavioSpringBootExercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import drinks.Drink;
import drinks.Lemonade;
import drinks.Water;
import drinks.Wine;
import godFather_s_Pizza.PizzaBase;
import godFather_s_Pizza.PizzaHawaiana;
import godFather_s_Pizza.PizzaMargherita;
import godFather_s_Pizza.PizzaSalame;
import godFather_s_Pizza.PizzaSize;
import merch.Mug;
import merch.Product;
import merch.Shirt;
import topping.Ananas;
import topping.Cipolla;
import topping.Mozzarella;
import topping.Prosciutto;
import topping.Salame;
import topping.Topping;

@Configuration
public class BeansConfig {
	
	@Bean
	String HelloW() {
		return "Hello World";
	}
	
	@Bean
	@Lazy
	String printMenu() {
		double famKcal = 1.95;
		double famPrice = 4.95; 
		System.out.println("*******************************************************************************************");
		System.out.println("////////// PIZZE //////////");
		String headerFormat = "| %-63s | %-30s | %-30s |%n";
		System.out.format(headerFormat, "Formato Pizza", "STANDARD", "FAMILY");
		System.out.format(headerFormat, "---------------------------------------------------------------", "------------------------------", "------------------------------");
		String tablePizzaFormat = "| %-20s | %-40s | %-14s | %-13s | %-14s | %-13s |%n";
        System.out.format(tablePizzaFormat, "Pizza", "Base", "Calorie", "Prezzo", "Calorie", "Prezzo €");
        System.out.format(tablePizzaFormat, "--------------------", "----", "-------", "-------", "------", "-------", "------");
        System.out.format(tablePizzaFormat, "Pizza Margherita", pizzaMargherita().getBase(), pizzaMargherita().calories(), pizzaMargherita().price(), Math.round(pizzaMargherita().calories() * famKcal), Math.round((pizzaMargherita().price() + famPrice)*100)/100.0);
        System.out.format(tablePizzaFormat, "Pizza Salamino", pizzaSalamino().getBase() + pizzaSalamino().getIngrediente(), pizzaSalamino().calories(), pizzaSalamino().price(), Math.round(pizzaSalamino().calories() * famKcal), Math.round((pizzaSalamino().price() + famPrice)*100)/100.0);
        System.out.format(tablePizzaFormat, "Pizza Hawaiana", pizzaHawaiana().getBase() + pizzaHawaiana().getIngrediente(), pizzaHawaiana().calories(), pizzaHawaiana().price(), Math.round(pizzaHawaiana().calories() * famKcal), Math.round((pizzaHawaiana().price() + famPrice)*100)/100.0);
        System.out.println();
        
        System.out.println("////////// TOPPING //////////");
        String tableToppingFormat = "| %-20s | %-15s | %-15s |%n";
        System.out.format(tableToppingFormat, "Topping", "Calorie", "Prezzo €");
        System.out.format(tableToppingFormat, "--------------------", "---------------", "---------------");
        System.out.format(tableToppingFormat, mozzarella().getName(), mozzarella().calories(), "+" + mozzarella().price());
        System.out.format(tableToppingFormat, prosciutto().getName(), prosciutto().calories(), "+" + prosciutto().price());
        System.out.format(tableToppingFormat, cipolla().getName(), cipolla().calories(), "+" + cipolla().price());
        System.out.format(tableToppingFormat, ananas().getName(), ananas().calories(), "+" + ananas().price());
        System.out.format(tableToppingFormat, salame().getName(), salame().calories(), "+" + salame().price());
        System.out.println();
        
        System.out.println("////////// DRINKS //////////");
        String tableDrinkFormat = "| %-20s | %-15s | %-15s |%n";
        System.out.format(tableDrinkFormat, "Drink", "Calorie", "Prezzo €");
        System.out.format(tableDrinkFormat, "--------------------", "---------------", "---------------");
        System.out.format(tableDrinkFormat, limonata().getName(), limonata().calories(), "+" + limonata().price());
        System.out.format(tableDrinkFormat, acqua().getName(), acqua().calories(), "+" + acqua().price());
        System.out.format(tableDrinkFormat, vino().getName(), vino().calories(), "+" + vino().price());
        System.out.println();
        
        System.out.println("////////// MERCHANDISE //////////");
        String tableMerchFormat = "| %-20s | %-15s |%n";
        System.out.format(tableMerchFormat, "Prodotto", "Prezzo €");
        System.out.format(tableMerchFormat, "--------------------", "---------------");
        System.out.format(tableMerchFormat, camicia().getName(), camicia().price());
        System.out.format(tableMerchFormat, tazza().getName(), tazza().price());
        System.out.println("*******************************************************************************************");
        return "";
	}
	
	@Bean
	PizzaBase pizzaMargherita() {
		return new PizzaBase(PizzaSize.STANDARD);
	}
	
	@Bean
	PizzaSalame pizzaSalamino() {
		return new PizzaSalame(PizzaSize.STANDARD);
	}
	
	@Bean
	PizzaHawaiana pizzaHawaiana() {
		return new PizzaHawaiana(PizzaSize.STANDARD);
	}
	
	@Bean
	Topping mozzarella() {
		return new Mozzarella();
	}
	
	@Bean
	Topping prosciutto() {
		return new Prosciutto();
	}
	
	@Bean
	Topping cipolla() {
		return new Cipolla();
	}
	
	@Bean
	Topping ananas() {
		return new Ananas();
	}
	
	@Bean
	Topping salame() {
		return new Salame();
	}
	
	@Bean
	Drink limonata() {
		return new Lemonade();
	}
	
	@Bean
	Drink acqua() {
		return new Water();
	}
	
	@Bean
	Drink vino() {
		return new Wine();
	}
	
	@Bean
	Product camicia() {
		return new Shirt();
	}
	
	@Bean
	Product tazza() {
		return new Mug();
	}
}

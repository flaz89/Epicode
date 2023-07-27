package godFather_s_Pizza;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PizzaBase implements Iprice, IfoodAndBeverage {
	
	private String base = "Pomodoro, Mozzarella";
	private PizzaSize size;
	
	public PizzaBase(PizzaSize _size) {
		this.size = _size;
	}
	


	@Override
	public double calories() {
		double kal;
		if (this.size == PizzaSize.STANDARD) {
			kal = 1104;
		} else {
			kal = 1104 * 1.95;
		}
		return Math.round(kal);
	}

	@Override
	public double price() {
		double priceBase;
		if (this.size == PizzaSize.STANDARD) {
			priceBase = 4.99;
		} else {
			priceBase = 4.99 + 4.15;
		}
		return priceBase;
	}

	@Override
	public String toString() {
		return "--Pizza Margherita:--\nbase = " + this.base + "\nformato = " + this.size + "\ncalorie = " + calories() + " Kcal" + "\nprezzo = " + price() + " €";
	}
	
}

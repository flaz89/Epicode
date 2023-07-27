package godFather_s_Pizza;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PizzaSalame extends PizzaBase {
	
	private String ingrediente = ", Salame";

	public PizzaSalame(PizzaSize _size) {
		super(_size);
	}
	
	

	@Override
	public double calories() {
		double kal;
		if (this.getSize() == PizzaSize.STANDARD) {
			kal = 1160;
		} else {
			kal = 1160 * 1.95;
		}
		return Math.round(kal);
	}
	
	@Override
	public double price() {
		double priceBase;
		if (this.getSize() == PizzaSize.STANDARD) {
			priceBase = 5.99;
		} else {
			priceBase = 5.99 + 4.15;
		}
		return priceBase;
	}
	
	@Override
	public String toString() {
		return "--Pizza Salame:--\nbase = " + getBase() + this.ingrediente + "\nformato = " + getSize() + "\ncalorie = " + calories()  + " Kcal" + "\nprezzo = " + price() + " €";
	}
	
}

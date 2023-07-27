package godFather_s_Pizza;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PizzaHawaiana extends PizzaBase {
	private String ingrediente = ", Ananas, Prosciutto";
	
	public PizzaHawaiana(PizzaSize _size) {
		super(_size);
	}
	
	

	@Override
	public double calories() {
		double kal;
		if (this.getSize() == PizzaSize.STANDARD) {
			kal = 1024;
		} else {
			kal = 1024 * 1.95;
		}
		return Math.round(kal);
	}
	
	@Override
	public double price() {
		double priceBase;
		if (this.getSize() == PizzaSize.STANDARD) {
			priceBase = 6.49;
		} else {
			priceBase = 6.49 + 4.15;
		}
		return priceBase;
	}
	
	@Override
	public String toString() {
		return "--Pizza Hawaiana:--\nbase = " + getBase() + this.ingrediente + "\nformato = " + getSize() + "\ncalorie = " + calories()  + " Kcal" + "\nprezzo = " + (price() + 1) + " €";
	}
	
}

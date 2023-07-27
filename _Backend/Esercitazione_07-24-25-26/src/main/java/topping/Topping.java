package topping;

import godFather_s_Pizza.IfoodAndBeverage;
import godFather_s_Pizza.Iprice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Topping implements IfoodAndBeverage, Iprice {
	private String name;
	
	@Override
	public double price() {
		return 0;
	}

	@Override
	public double calories() {
		return 0;
	}
	
	
}

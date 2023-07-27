package merch;

import godFather_s_Pizza.Iprice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product implements Iprice {
	private String name;
	
	@Override
	public double price() {
		return 0;
	}
	
}

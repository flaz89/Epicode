package flavioSpringBootData.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Building {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String address;
	private String city;
	
	@OneToMany(mappedBy = "buildingName")
	List<Space> loacation;
	
	public Building(String _name, String _address, String _city) {
		this.name = _name;
		this.address = _address;
		this.city = _city;
	}
}

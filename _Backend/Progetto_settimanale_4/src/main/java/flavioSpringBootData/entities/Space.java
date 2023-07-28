package flavioSpringBootData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Space {
	@Id
	@GeneratedValue
	private int id;
	
	private String description;
	private int users;
	@ManyToOne
	private Building buildingName;
	@Enumerated(EnumType.STRING)
	private SpaceType type;
	private boolean occupied = false;
	
	@OneToOne(mappedBy = "space")
	private Booking booking;
	
	public Space(String _description, int _user, Building _buildingName, SpaceType _type) {
		this.description = _description;
		this.users = _user;
		this.buildingName = _buildingName;
		this.type = _type;
	}
	
	
}

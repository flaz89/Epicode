package flavioSpringBootWeb.es_2.space;


import flavioSpringBootWeb.es_2.booking.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Space {

	private int id;
	
	private String description;
	private int users;
	private String city;
	private SpaceType type;
	private boolean occupied = false;
	

	private Booking booking;
	
	public Space(String _description, int _user,String _city, SpaceType _type) {
		this.description = _description;
		this.users = _user;
		this.type = _type;
		this.city = _city;
	}
	
	
}

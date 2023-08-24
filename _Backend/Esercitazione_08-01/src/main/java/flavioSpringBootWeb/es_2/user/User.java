package flavioSpringBootWeb.es_2.user;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {

	private int id;
	
	private String name;
	private String surname;
	private String email;
	
	
	public User(String _name, String _surname, String _mail) {
		this.name = _name;
		this.surname = _surname;
		this.email = _mail;
	}


	@Override
	public String toString() {
		return "[\name = " + name + "\nsurname = " + surname + "\n]";
	}
	
	
	
}

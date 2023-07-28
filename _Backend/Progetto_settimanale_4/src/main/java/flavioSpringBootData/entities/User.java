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
public class User {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String surname;
	private String email;
	
	@OneToMany(mappedBy = "userId" )
	List<Booking> booking;
	
	
	public User(String _name, String _surname, String _mail) {
		this.name = _name;
		this.surname = _surname;
		this.email = _mail;
	}


	@Override
	public String toString() {
		return "[\nname = " + name + "\nsurname = " + surname + "\n]";
	}
	
	
	
}

package flavioSpringBootWebdb.entities.user;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
	private UUID id;
	
	private String name;
	private String surname;
	private String email;
	
	
	public User(String _name, String _surname, String _email) {
		this.name = _name;
		this.surname = _surname;
		this.email = _email;
	}
	
}

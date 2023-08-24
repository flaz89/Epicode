package flavioSpringBootWebdb.entities.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class UserBodyRequest {
	
	private String name;
	private String surname;
	private String email;
}

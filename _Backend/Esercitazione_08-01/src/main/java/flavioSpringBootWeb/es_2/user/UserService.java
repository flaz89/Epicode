package flavioSpringBootWeb.es_2.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@Getter
public class UserService {

	private List<User> users = new ArrayList<>();
	
	//salvataggio di un utente
	public User saveUser(User user) {
		Random rndm = new Random();
		user.setId(Math.abs(rndm.nextInt()));
		this.users.add(user);
		return user;
	}
	
	
}

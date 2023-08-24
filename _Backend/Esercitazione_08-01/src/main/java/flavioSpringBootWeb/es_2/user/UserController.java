package flavioSpringBootWeb.es_2.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService usersSrv;
	
	@GetMapping
	public List<User> allUsers(){
		return usersSrv.getUsers();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User saveUser(@RequestBody User body) {
		usersSrv.saveUser(body);
		System.out.println(body);
		return body;
	}
}

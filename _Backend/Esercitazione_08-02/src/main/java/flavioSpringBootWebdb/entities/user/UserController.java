package flavioSpringBootWebdb.entities.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userSrv;
	
	@Autowired
	public UserController(UserService userSrv) {
		super();
		this.userSrv = userSrv;
	}

	//CRUD
	
	//1 - GET per tornare la lista di utenti
	@GetMapping
	public Page<User> getUserList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
		return userSrv.userList(page, size);
	}
	
	//2 - GET per tornare l'utente byId
	@GetMapping("/{userId}")
	public User getUserbyId(@PathVariable UUID userId) {
		return userSrv.findUserbyId(userId);
		
	}
	
	//3 - POST per postare l'utente con Body
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody UserBodyRequest userBody) {
		System.out.println("Utente generato con successo");
		User newUser = userSrv.saveUser(userBody);
		return newUser;
	}
	
	//4 - PUT per modificare l'utente tramite id e Body
	@PutMapping("/{userId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public User updateUser(@PathVariable UUID userId, @RequestBody UserBodyRequest body) {
		return userSrv.findUserByIdAndUpdate(userId, body);
	}
	
	//5 - DELETE per cancellare l'utente
	@DeleteMapping("/{userId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable UUID userId) {
		userSrv.deleteUserbyId(userId);
	}
}

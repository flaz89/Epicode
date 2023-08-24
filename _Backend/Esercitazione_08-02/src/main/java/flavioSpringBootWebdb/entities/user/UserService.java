package flavioSpringBootWebdb.entities.user;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import flavioSpringBootWebdb.exceptions.NotFoundExceptions;

@Service
public class UserService {
	
	
	private final UserRepository userRepo;
	
	@Autowired
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}



	public Page<User> userList(int page, int size) {
		PageRequest pageable = PageRequest.of(page, size);
		return userRepo.findAll(pageable);
	}
	
	public User saveUser(UserBodyRequest body) {
		User newUser = new User(body.getName(), body.getSurname(), body.getEmail());
		return userRepo.save(newUser);
	}
	
	public User findUserbyId(UUID userId) throws NotFoundExceptions {
		User found = userRepo.findById(userId).orElseThrow(() -> new NotFoundExceptions(userId));
		return found;
	}
	
	public User findUserByIdAndUpdate(UUID userId, UserBodyRequest body) {
		User found = userRepo.findById(userId).orElseThrow(() -> new NotFoundExceptions(userId));
		found.setName(body.getName());
		found.setSurname(body.getSurname());
		found.setEmail(body.getEmail());
		return userRepo.save(found);
	}
	
	public void deleteUserbyId(UUID userId) {
		User found = userRepo.findById(userId).orElseThrow(() -> new NotFoundExceptions(userId));
		userRepo.delete(found);
	}

}

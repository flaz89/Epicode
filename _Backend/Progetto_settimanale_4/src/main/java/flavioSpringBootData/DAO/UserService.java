package flavioSpringBootData.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flavioSpringBootData.entities.User;

@Service
public class UserService implements I_userDAO {
	
	@Autowired
	private UsersRepository userRepo;

	@Override
	public void saveUser(User user) {
		try {
			userRepo.save(user);
			System.out.println("Utente: " + user + " è stato creato corretamente");
		}catch(Exception e) {
			System.out.println("Errore in fase di salvataggio: " + e.getStackTrace());
		}
	}


}

package flavioSpringBootData.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flavioSpringBootData.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{

}

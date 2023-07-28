package flavioSpringBootData.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.SpaceType;

@Repository
public interface SpacesRepository extends JpaRepository<Space, Integer> {
	
	List<Space> findByTypeAndBuildingName_City(SpaceType type, String city);
}

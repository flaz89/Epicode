package flavioSpringBootData.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flavioSpringBootData.entities.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {

}

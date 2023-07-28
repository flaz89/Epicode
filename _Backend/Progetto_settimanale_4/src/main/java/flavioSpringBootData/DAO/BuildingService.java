package flavioSpringBootData.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flavioSpringBootData.entities.Building;

@Service
public class BuildingService implements I_buildingDAO {
	
	@Autowired
	private BuildingRepository buildingRepo;

	@Override
	public void saveBuilding(Building building) {
		try {
			buildingRepo.save(building);
			System.out.println("Edificio: " + building + " è stato creato corretamente");
		}catch(Exception e) {
			System.out.println("Errore in fase di salvataggio: " + e.getStackTrace());
		}
	}
}

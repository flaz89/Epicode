package flavioSpringBootData.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.SpaceType;
import flavioSpringBootData.entities.User;

@Service
public class SpaceService implements I_spaceDAO {
	
	@Autowired
	private SpacesRepository spaceRepo;

	@Override
	public void saveSpace(Space space) {
		try {
			spaceRepo.save(space);
			System.out.println("Postazione: " + space + " è stato creato corretamente");
		} catch(Exception e) {
			System.out.println("Errore in fase di salvataggio: " + e.getStackTrace() + e.getMessage());
		}
	}
	
	@Override
	public void findSpacesByTypeAndCity(SpaceType type, String city) {
        List<Space> spaces = spaceRepo.findByTypeAndBuildingName_City(type, city);
        if (!spaces.isEmpty()) {
            for (Space space : spaces) {
                System.out.println("Postazione trovata presso: "+ space.getBuildingName().getName() + " conId [" + space.getId() + "] " + space.getBuildingName().getName() + " " + type);
            }
        } else {
            System.out.println("Nessuna postazione trovata per il tipo '" + type + "' nella città '" + city + "'.");
        } 
    }
	
	public boolean isSpaceOccupied(Space space) {
        return space.isOccupied();
    }
}

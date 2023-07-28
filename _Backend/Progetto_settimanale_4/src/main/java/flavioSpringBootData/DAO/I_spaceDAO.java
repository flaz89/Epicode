package flavioSpringBootData.DAO;

import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.SpaceType;

public interface I_spaceDAO {
	
	public void saveSpace(Space space);
	
	public void findSpacesByTypeAndCity(SpaceType type, String city);
	
	public boolean isSpaceOccupied(Space space);
}

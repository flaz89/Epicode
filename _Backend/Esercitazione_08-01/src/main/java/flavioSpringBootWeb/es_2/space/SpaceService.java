package flavioSpringBootWeb.es_2.space;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
@Getter
public class SpaceService {
	
	private List<Space> spaceList = new ArrayList<>();
	
	
	public Space searchPlaceByTypeAndCity(SpaceType type, String City) {
		for (Space space : spaceList) {
			if(space.getType() == type && space.getCity().equals(City)) {
				return space;
			}
		}
		return null;
	}
	
	public Space saveSpace(Space space) {
		Random rndm = new Random();
		space.setId(Math.abs(rndm.nextInt()));
		this.spaceList.add(space);
		return space;
	}
}

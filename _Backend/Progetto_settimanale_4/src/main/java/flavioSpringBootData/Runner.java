package flavioSpringBootData;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import flavioSpringBootData.DAO.I_bookingDAO;
import flavioSpringBootData.DAO.I_buildingDAO;
import flavioSpringBootData.DAO.I_spaceDAO;
import flavioSpringBootData.DAO.I_userDAO;
import flavioSpringBootData.entities.Booking;
import flavioSpringBootData.entities.Building;
import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.SpaceType;
import flavioSpringBootData.entities.User;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private I_userDAO userDAO;
	
	@Autowired
	private I_buildingDAO buildingDAO;
	
	@Autowired
	private I_spaceDAO spaceDAO;
	
	@Autowired
	private I_bookingDAO bookingDAO;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		User user1 = new User("Giovanni", "Liari", "giova.liari@gmail.it");
//		User user2 = new User("Flavio", "Mammo", "fla.mammo@gmail.it");
//		User user3 = new User("Marco", "Pinsi", "marco.pinsi@gmail.it");
		User user4 = new User("Lorenzo", "Terzi", "lorenzo.trz@gmail.it");
//		
//		userDAO.saveUser(user1);
//		userDAO.saveUser(user2);
//		userDAO.saveUser(user3);
//		userDAO.saveUser(user4);
//		
		Building google = new Building("Google Center", "1600 Amphitheatre Parkway", "Mountain View");
//		Building marriott = new Building("Marriott Marquis NY", "1535 Broadway", "New York");
//		Building sanpaolo = new Building("Grattacielo Intesa Sanpaolo", "C.so Inghilterra 3", "Torino");
//		Building broletto = new Building("Broletto", "Via Broletto 46", "Milano");
//		
//		buildingDAO.saveBuilding(google);
//		buildingDAO.saveBuilding(marriott);
//		buildingDAO.saveBuilding(sanpaolo);
//		buildingDAO.saveBuilding(broletto);
//		
//		
		Space spaceGoogle = new Space("Spazio innovativo", 5, google, SpaceType.OPEN_SPACE);
//		Space spaceMarriot = new Space("Spazio lussuoso", 30, marriott, SpaceType.MEETING_ROOM);
//		Space spaceSanpaolo = new Space("Uffici formali", 15, sanpaolo, SpaceType.MEETING_ROOM);
//		Space spaceBroletto = new Space("Cooworking funzionale", 5, broletto, SpaceType.PRIVATE);
//		
//		spaceDAO.saveSpace(spaceGoogle);
//		spaceDAO.saveSpace(spaceMarriot);
//		spaceDAO.saveSpace(spaceSanpaolo);
//		spaceDAO.saveSpace(spaceBroletto);
//		
//		Booking bookingUser1 = new Booking(LocalDate.of(2023, 7, 30), user1, spaceBroletto);
//		Booking bookingUser2 = new Booking(LocalDate.of(2023, 9, 15), user2, spaceGoogle);
//		Booking bookingUser3 = new Booking(LocalDate.of(2023, 8, 4), user3, spaceMarriot);
//		Booking bookingUser4 = new Booking(LocalDate.of(2023, 8, 23), user4, spaceSanpaolo);
//		
//		bookingDAO.saveBooking(bookingUser1);
//		bookingDAO.saveBooking(bookingUser2);
//		bookingDAO.saveBooking(bookingUser3);
//		bookingDAO.saveBooking(bookingUser4);
		
		
		spaceDAO.findSpacesByTypeAndCity(SpaceType.OPEN_SPACE, "Mountain View");
		
		bookingDAO.makeBooking(user4, LocalDate.of(2024, 1, 1), spaceGoogle);
		
	}

}

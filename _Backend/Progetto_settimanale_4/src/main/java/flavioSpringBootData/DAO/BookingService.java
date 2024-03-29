package flavioSpringBootData.DAO;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flavioSpringBootData.entities.Booking;
import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.User;

@Service
public class BookingService implements I_bookingDAO {
	
	@Autowired
	private BookingRepository bookingRepo;
	
	@Autowired
	private SpaceService spaceService;

	@Override
	public void saveBooking(Booking booking) {
		try {
			bookingRepo.save(booking);
			System.out.println("Prenotazione: " + booking + " è stata creata corretamente");
		}catch(Exception e) {
			System.out.println("Errore in fase di salvataggio: " + e.getStackTrace());
		}
	}

	@Override
	public void makeBooking(User user, LocalDate bookingDate, Space space) {
		if (spaceService.isSpaceOccupied(space)) {
            System.out.println("Impossibile effettuare la prenotazione. La postazione è già occupata.");
            return;
        }
		spaceService.saveSpace(space);
		space.setOccupied(true);
		
		Booking booking = new Booking(bookingDate, user, space);
		bookingRepo.save(booking);
		System.out.println("Prenotazione creata con successo: " + booking.toString());
	}
	
}

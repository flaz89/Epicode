package flavioSpringBootData.DAO;

import java.time.LocalDate;

import flavioSpringBootData.entities.Booking;
import flavioSpringBootData.entities.Space;
import flavioSpringBootData.entities.User;

public interface I_bookingDAO {
	
	public void saveBooking(Booking booking);
	
	public void createBooking(User userId, LocalDate bookingDate, Space id);
}

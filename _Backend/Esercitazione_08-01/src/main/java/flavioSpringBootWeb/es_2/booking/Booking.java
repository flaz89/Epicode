package flavioSpringBootWeb.es_2.booking;

import java.time.LocalDate;
import java.util.UUID;

import flavioSpringBootWeb.es_2.space.Space;
import flavioSpringBootWeb.es_2.user.User;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Booking {

	private UUID id;
	
	private LocalDate bookingDate;

	private User userId;

	private Space space;
	
	public Booking(LocalDate _bookingDate, User _user, Space _space) {
		this.bookingDate = _bookingDate;
		this.userId = _user;
		this.space = _space;
	}
}

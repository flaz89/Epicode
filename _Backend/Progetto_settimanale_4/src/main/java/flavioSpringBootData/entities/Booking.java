package flavioSpringBootData.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Booking {
	@Id
	@GeneratedValue
	private UUID id;
	
	private LocalDate bookingDate;
	@ManyToOne
	private User userId;
	@OneToOne
	private Space space;
	
	public Booking(LocalDate _bookingDate, User _user, Space _space) {
		this.bookingDate = _bookingDate;
		this.userId = _user;
		this.space = _space;
	}
}

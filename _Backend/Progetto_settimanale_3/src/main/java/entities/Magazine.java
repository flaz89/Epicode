package entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Magazine extends BookMag {
	@Enumerated(EnumType.STRING)
	Periodicity periodicity;
	
	public Magazine(long  _isbn, String _title, LocalDate _date, int _pages, Periodicity _periodicity) {
		super(_isbn, _title, _date, _pages);
		this.periodicity = _periodicity;
	}

	@Override
	public String toString() {
		return "Magazine -> " + super.toString() + "[periodicity] = " + periodicity;
	}
	
}

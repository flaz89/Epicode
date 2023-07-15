package entities;

import java.time.LocalDate;

import javax.persistence.Entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Book extends BookMag {
	String author;
	String type;
	
	public Book(String _author, String _type, long _isbn, String _title, LocalDate _date, int _pages) {
		super(_isbn, _title, _date, _pages);
		this.author = _author;
		this.type = _type;
	}

	@Override
	public String toString() {
		return "Book -> " + super.toString() + " [author] = " + author + ", [type] = " + type;
	}
	
	
	
} 

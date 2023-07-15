package entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class BookMag {
    @Id
    private long isbn;
    private String title;
    private LocalDate date;
    private int pages;
	@Override
	public String toString() {
		return "[isbn] = " + isbn + ", [title] = " + title + ", [date] = " + date + ", [pages] = " + pages+", ";
	}

//    public BookMag(long _isbn, String _title, LocalDate _date, int _pages) {
//        this.isbn = _isbn;
//        this.title = _title;
//        this.date = _date;
//        this.pages = _pages;
//    }
    
    
}


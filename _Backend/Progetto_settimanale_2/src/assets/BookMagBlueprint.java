package assets;

import java.time.LocalDate;
import java.util.Random;

public abstract class BookMagBlueprint {
	private long isbn = 1_000_000_000_000l + new Random().nextLong(9_000_000_000_000l);
	private String title;
	private int date;
	private int pages;
	
	public BookMagBlueprint(String _title, int _date, int _pages ) {
		this.title = _title;
		this.date = _date;
		this.pages = _pages;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "[isbn] = " + isbn + ", [title] = " + title + ", [date] = " + date + ", [pages] = " + pages;
	}
	
	
	
}

package assets;

import java.time.LocalDate;

public class Book extends BookMagBlueprint {
	
	String author;
	String genres;

	public Book(String _title, int _date, int _pages, String _author, String _genres) {
		super(_title, _date, _pages);
		
		this.author = _author;
		this.genres = _genres;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "[author] = " + author + ", [genres] = " + genres;
	}
	
	
	
	

}

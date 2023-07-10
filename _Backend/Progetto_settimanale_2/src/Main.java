
import java.util.ArrayList;
import java.util.Optional;

import assets.Book;
import assets.BookMagBlueprint;
import assets.Magazine;
import assets.Periodicity;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<BookMagBlueprint> libraryArchive = new ArrayList<>();
		
		Book book1 = new Book("Batman il pipistrello", 1934, 55, "Bob Kane", "COMICS");
		Book book2 = new Book("DragonBall",1980, 120, "Akira Toriyama", "MANGA");
		Book book3 = new Book("Il Signoro degli Anelli",1980, 680, "J. R. R. Tolkien", "FANTASY");
		Book book4 = new Book("Il Codice Davinci",2003, 320, "Dan Brown", "ROMANZO");
		Book book5 = new Book("I Pilastri della Terra",1989, 470, "Ken Follet", "ROMANZO");
		
		Magazine mag1 = new Magazine("Quattro Ruote",2023, 66, Periodicity.WEEKLY);
		Magazine mag2 = new Magazine("AD",2022, 90, Periodicity.MONTHLY);
		Magazine mag3 = new Magazine("Novella2000", 2023, 90, Periodicity.WEEKLY);
		Magazine mag4 = new Magazine("Papers",2022, 90, Periodicity.HALF_YEARLY);
		
		
		libraryArchive.add(book1);
		libraryArchive.add(book2);
		libraryArchive.add(book3);
		libraryArchive.add(book4);
		libraryArchive.add(book5);
		libraryArchive.add(mag1);
		libraryArchive.add(mag2);
		libraryArchive.add(mag3);
		libraryArchive.add(mag4);
		
		printAchive(libraryArchive);
		
		System.out.println();
		
		searchByISBN(libraryArchive, elementISBN(book4));
		
		System.out.println();
		
		removeByISBN(libraryArchive, book4);
		
		System.out.println();
		
		printAchive(libraryArchive);
		
		System.out.println();
		
		searchByDate(libraryArchive, 2003);
		
		System.out.println();
		
		searchByAuthor(libraryArchive, "Dan Brown");
		
	}
	// ---------------------------------------------- 
	
	
	// STAMPO TUTTO L'ARRAY ------------------------------------------
	public static <E> void printAchive(ArrayList<E> arr) {
		for (E item : arr) {			
			System.out.println(item);
		}
	}
	
	// RECUPERO L'ISBN dell'oggetto d'interesse -------------
	
	public static long elementISBN(BookMagBlueprint item) {
		return item.getIsbn();
	}
	
	// RIMUOVO L'ELEMENTO per ISBN ---------------------------
	
	public static void removeByISBN(ArrayList<BookMagBlueprint> arr, BookMagBlueprint isbn) {
		arr.removeIf(item -> {
			
		    if (item instanceof BookMagBlueprint) {
		    return Long.valueOf(item.getIsbn()).equals(elementISBN(isbn));
		    
		    }
		    
		    return false;
		});
	}
	
	// RICERCA OGGETTO per ISBN ---------------------------
	
	public static void searchByISBN(ArrayList<BookMagBlueprint> arr, long isbn) {
		Optional<BookMagBlueprint> prodIsbn = arr.stream().filter(item -> Long.valueOf(item.getIsbn()).equals(isbn)).findFirst();
		
		if (prodIsbn.isPresent()) {
			
	        BookMagBlueprint item = prodIsbn.get();
	        System.out.println("Elemento trovato:\n" + item);
	        
	    } else {
	    	
	        System.err.println("Nessun elemento trovato con il codice ISBN " + isbn);
	        
	    }
	}
	
	// RICERCA OGGETTO per ANNO ---------------------------
	
	public static void searchByDate(ArrayList<BookMagBlueprint> arr, int date) {
	    Optional<BookMagBlueprint> prodDate = arr.stream().filter(item -> item.getDate() == date).findFirst();

	    if (prodDate.isPresent()) {
	        BookMagBlueprint item = prodDate.get();
	        System.out.println("Elemento trovato:\n" + item);
	    } else {
	        System.err.println("Nessun titolo trovato con questa data di pubblicazione: " + date);
	    }
	}

	// RICERCA OGGETTO per AUTORE ---------------------------
	
	public static void searchByAuthor(ArrayList<BookMagBlueprint> arr, String author) {
		Optional<BookMagBlueprint> prodAuthor = arr.stream().filter(item -> item instanceof Book).filter(item -> String.valueOf(((Book) item).getAuthor()).equals(author)).findFirst();
		
		if (prodAuthor.isPresent()) {
			
	        BookMagBlueprint item = prodAuthor.get();
	        System.out.println("Elemento trovato:\n" + item);
	        
	    } else {

	        System.err.println("Nessun titolo di " + author +  " è stato trovato");
	    }
	}

	//private static File file = new File()
}

package app;

import java.time.LocalDate;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Book;
import entities.Magazine;
import entities.ManageArchive;
import entities.Periodicity;

public class Main {
	
 public static void main(String[] args) {
	 
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryCatalogJPA");
	 EntityManager em = emf.createEntityManager();
	 
	 
	 ManageArchive operation = new ManageArchive();
	 
	 // PRODOTTI ARCHIVIO --------------------------------------------
	 Book book1 = new Book("Ken Follet", "Romanzo", randomIsbn(), "I Pilastri della Terra", LocalDate.of(2000, 07, 20), 400);
	 Book book2 = new Book("Alessandro Manzoni", "Romanzo", randomIsbn(), "I Promessi Sposi", LocalDate.of(1825, 01, 01), 600);
	 Book book3 = new Book("J.K Rowling", "Romanzo", randomIsbn(), "Harry Potter e la Pietra Filosofale", LocalDate.of(2000, 03, 21), 380);
	 Magazine mag1 = new Magazine(randomIsbn(), "Quattro Ruote", LocalDate.now(), 100, Periodicity.MONTHLY);
	 Magazine mag2 = new Magazine(randomIsbn(), "National Geographic", LocalDate.now(), 120, Periodicity.MONTHLY);
	 Magazine mag3 = new Magazine(randomIsbn(), "Scientific American", LocalDate.of(2000, 02, 11), 110, Periodicity.MONTHLY);
	 
	 
	 // OPERAZIONI ARCHIVIO --------------------------------------------
	 	
		//operation.addItem(mag3);
		//operation.removeItemByIsbn(1135499518945L);
		//operation.searchItemByIsbn(5834718413103L);
		//operation.searchByYear(2000);
	 	//operation.searchByAuthor("Alessandro");
	 	//operation.searchByTitle("Spos");
 }
 
 static public long randomIsbn() {
	 long rIsbn = 1_000_000_000_000l + new Random().nextLong(9_000_000_000_000l);
	 return rIsbn;
 	}
 
}

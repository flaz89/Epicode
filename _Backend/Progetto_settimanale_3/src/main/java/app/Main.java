package app;

import java.time.LocalDate;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Book;
import entities.Loan;
import entities.Magazine;
import entities.ManageArchive;
import entities.Periodicity;
import entities.User;

public class Main {
	
 public static void main(String[] args) {
	 
	 
	 ManageArchive operation = new ManageArchive();
	 
	 // PRODOTTI ARCHIVIO --------------------------------------------
	 Book book1 = new Book("Ken Follet", "Romanzo", randomIsbn(), "I Pilastri della Terra", LocalDate.of(2000, 07, 20), 400);
	 Book book2 = new Book("Alessandro Manzoni", "Romanzo", randomIsbn(), "I Promessi Sposi", LocalDate.of(1825, 01, 01), 600);
	 Book book3 = new Book("J.K Rowling", "Romanzo", randomIsbn(), "Harry Potter e la Pietra Filosofale", LocalDate.of(2000, 03, 21), 380);
	 Magazine mag1 = new Magazine(randomIsbn(), "Quattro Ruote", LocalDate.now(), 100, Periodicity.MONTHLY);
	 Magazine mag2 = new Magazine(randomIsbn(), "National Geographic", LocalDate.now(), 120, Periodicity.MONTHLY);
	 Magazine mag3 = new Magazine(randomIsbn(), "Scientific American", LocalDate.of(2000, 02, 11), 110, Periodicity.MONTHLY);
	 
	// UTENTI --------------------------------------------
	 User user1 = new User("Marco", "Zini", LocalDate.of(2000, 02, 11), randomCardNum());
	 User user2 = new User("Simone", "Parosso", LocalDate.of(1980, 07, 29), randomCardNum());
	 User user3 = new User("Giovanni", "Gruvyuk", LocalDate.of(1967, 03, 7), randomCardNum());
	 
	// PRESTITI --------------------------------------------
	 Loan loan1 = new Loan(user1, mag1, LocalDate.of(2023, 06, 5), LocalDate.of(2023, 07, 11));
	 Loan loan2 = new Loan(user2, book2, LocalDate.of(2023, 05, 4), LocalDate.of(2023, 06, 4));
	 Loan loan3 = new Loan(user3, mag2, LocalDate.now(), null);
	 
	 
	 
	 
	 // OPERAZIONI DB --------------------------------------------
	 	
//		operation.addItem(book1);
//		operation.addItem(book2);
//		operation.addItem(book3);
//		operation.addItem(mag1);
//		operation.addItem(mag2);
//		operation.addItem(mag3);
		
		
//		operation.removeItemByIsbn(1135499518945L);
//		operation.searchItemByIsbn(5834718413103L);
//		operation.searchByYear(2000);
//	 	operation.searchByAuthor("Alessandro");
//	 	operation.searchByTitle("Spos");
		
//		operation.addUser(user1);
//		operation.addUser(user2);
//		operation.addUser(user3);
	 
	 	operation.addLoan(loan1);
//	 	operation.addLoan(loan2);
//	 	operation.addLoan(loan3);
		
	 
	 
	 
	 	
 }
 
 	static public long randomIsbn() {
	 long rIsbn = 1_000_000_000_000l + new Random().nextLong(9_000_000_000_000l);
	 return rIsbn;
 	}
 	
 	static public int randomCardNum() {
 		int rNum = 1_000_000_000 + new Random().nextInt(Integer.MAX_VALUE);
 		return Math.abs(rNum);
 	}
 
}

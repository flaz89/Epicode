package entities;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ManageArchive {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryCatalogJPA");

	//AGGIUNGO UN ITEM AL DATABASE ---------------------------------------- //
	public void addItem(BookMag item) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(item);
			em.getTransaction().commit();
			System.out.println("oggetto caricato correttamente");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}
	
	//RIMUOVO UN ITEM AL DATABASE CON ISBN ---------------------------------------- //
	public void removeItemByIsbn(long isbn) {
		EntityManager em = emf.createEntityManager();
		try {
			BookMag item = em.find(BookMag.class, isbn);
			if (item != null) {
				em.getTransaction().begin();
				em.remove(item);
				em.getTransaction().commit();
				System.out.println("Oggetto rimosso correttamemte - " + item.getIsbn() + " " + item.getTitle());
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			em.close();
		}
	}
	
	//RICERCO UN ITEM TRAMITE ISBN ---------------------------------------- //
	public void searchItemByIsbn(long isbn) {
		EntityManager em = emf.createEntityManager();
		BookMag item = em.find(BookMag.class,isbn);
		System.out.println(item);
		em.close();
	}
	
	//RICERCO UN ITEM PER DATA PUB (ANNO) ---------------------------------------- //
	public void searchByYear(int year) {
	    EntityManager em = emf.createEntityManager();
	    try {
	        List<BookMag> listByYear = em.createQuery("SELECT bm FROM BookMag bm WHERE FUNCTION('YEAR', bm.date) = :year", BookMag.class).setParameter("year", year).getResultList();

	        if (listByYear.isEmpty()) {
	            System.out.println("Nessun elemento trovato");
	        } else {
	            for (BookMag element : listByYear) {
	                System.out.println(element);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Errore durante la ricerca per anno");
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
	
	//RICERCO UN ITEM PER AUTORE ---------------------------------------- //
	public void searchByAuthor(String author) {
	    EntityManager em = emf.createEntityManager();
	    try {
	        List<BookMag> listByAuthor = em.createQuery("SELECT bm FROM BookMag bm WHERE bm.author = :author", BookMag.class).setParameter("author", author).getResultList();

	        if (listByAuthor.isEmpty()) {
	            System.out.println("Nessun autore trovato");
	        } else {
	            for (BookMag element : listByAuthor) {
	                System.out.println(element);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Errore durante la ricerca per autore");
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	}
	
	//RICERCO PER TITOLO O PER UNA PARTE DI ESSO ---------------------------------------- //
	public void searchByTitle(String str) {
	    EntityManager em = emf.createEntityManager();
	    try {
	        List<BookMag> listByTitle = em.createQuery("SELECT bm FROM BookMag bm WHERE bm.title LIKE :title", BookMag.class).setParameter("title", "%" + str + "%").getResultList();

	        if (listByTitle.isEmpty()) {
	            System.out.println("Nessun titolo trovato");
	        } else {
	            for (BookMag element : listByTitle) {
	                System.out.println(element);
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Errore durante la ricerca del titolo");
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	    
	}
	
	//AGGIUNGO UN UTENTE AL DATABASE ---------------------------------------- //
		public void addUser(User user) {
			EntityManager em = emf.createEntityManager();
			try {
				em.getTransaction().begin();
				em.persist(user);
				em.getTransaction().commit();
				System.out.println("Utente aggiunto correttamente");
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				em.close();
			}
		}
		
	//AGGIUNGO UN PRESTITO AL DATABASE ---------------------------------------- // 
		//errore in fase di aggiornamento database, mi aggiunge la copia dell'oggetto BoojMag che gli passo nel costruttore, che l'utente
			public void addLoan(Loan loan) {
				EntityManager em = emf.createEntityManager();
				try {
					em.getTransaction().begin();
					em.persist(loan);
					em.getTransaction().commit();
					System.out.println("Prestito aggiunto correttamente");
				} catch(Exception e) {
					System.out.println("C'è stato un errore in fase di caricamento");
					e.printStackTrace();
				} finally {
					em.close();
				}
			}

}

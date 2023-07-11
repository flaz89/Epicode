package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

	private final EntityManager em;
	
	public EventoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Evento e) {
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		em.persist(e);
		t.commit();
		
		System.out.println("Studente salvato correttamente");
	}
}

package app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Evento;
import entities.EventoDAO;
import entities.TipoEvento;
import utils.JpaUtil;

public class Main {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		
		Evento kff = new Evento("KFF", LocalDate.of(2023, 07, 04), "Festival techno", TipoEvento.PUBBLICO, 100000);
		EventoDAO ed = new EventoDAO(em);
		
		System.out.println("CIAO");
		
		ed.save(kff);
		
	}

}

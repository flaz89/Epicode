package deviceManagement;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import deviceManagement.esercizio_1.Info;
import deviceManagement.esercizio_1.InfoAdapter;
import deviceManagement.esercizio_1.UserData;
import deviceManagement.esercizio_2.Libro;
import deviceManagement.esercizio_2.Pagina;
import deviceManagement.esercizio_2.Sezione;

@SpringBootApplication
public class Esercitazione0824Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercitazione0824Application.class, args);
		
		// ------- ESERCIZIO 1 ---------
		
		Info info = new Info();
		info.setNome("Mario");
		info.setCognome("Rossi");
		info.setDataDiNascita(new Date(90, 5, 15));
		
		
		InfoAdapter adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println();
        System.out.println("------- ESERCIZIO 1 ---------");
        System.out.println("Nome completo: " + userData.getFullName());
        System.out.println("Età: " + userData.getAge());
        System.out.println();
        
     // ------- ESERCIZIO 2 ---------
        
        Pagina pagina1 = new Pagina(10);
        Pagina pagina2 = new Pagina(8);
        Sezione sezione1 = new Sezione();
        sezione1.aggiungiElemento(new Pagina(5));
        sezione1.aggiungiElemento(new Pagina(6));

        Sezione sezione2 = new Sezione();
        sezione2.aggiungiElemento(new Pagina(4));
        sezione2.aggiungiElemento(new Pagina(3));

        Libro libro = new Libro();
        libro.aggiungiElemento(pagina1);
        libro.aggiungiElemento(pagina2);
        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);
        libro.aggiungiAutore("Autore 1");
        libro.aggiungiAutore("Autore 2");
        libro.setPrezzo(29.99);

        System.out.println("------- ESERCIZIO 2 ---------");
        libro.stampa();
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
	}

}

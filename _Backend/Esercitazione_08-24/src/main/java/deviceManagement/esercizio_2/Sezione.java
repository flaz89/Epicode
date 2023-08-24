package deviceManagement.esercizio_2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Element {
	private List<Element> elementi = new ArrayList<>();

    public void aggiungiElemento(Element elemento) {
        elementi.add(elemento);
    }

    public int getNumeroPagine() {
        int totalePagine = 0;
        for (Element elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    public void stampa() {
        System.out.println("Stampa Sezione - Numero Pagine: " + getNumeroPagine());
        for (Element elemento : elementi) {
            elemento.stampa();
        }
    }
}

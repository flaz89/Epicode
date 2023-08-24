package deviceManagement.esercizio_2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Element{
	private List<Element> elementi = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;

    public void aggiungiElemento(Element elemento) {
        elementi.add(elemento);
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPagine() {
        int totalePagine = 0;
        for (Element elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    public void stampa() {
        System.out.println("Stampa Libro - Numero Pagine: " + getNumeroPagine());
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: " + prezzo);
        for (Element elemento : elementi) {
            elemento.stampa();
        }
    }
}

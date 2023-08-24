package deviceManagement.esercizio_2;

import lombok.Getter;

@Getter
public class Pagina implements Element {
	private int numeroPagine;

    public Pagina(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public void stampa() {
        System.out.println("Stampa Pagina - Numero Pagine: " + numeroPagine);
    }
}

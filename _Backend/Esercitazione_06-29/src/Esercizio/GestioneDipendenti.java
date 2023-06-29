package Esercizio;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente marco = new Dipendente("12H0", Dipartimento.PRODUZIONE);
		Dipendente luca = new Dipendente("AAZ1", 1600.0, 35.0, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente giovanni = new Dipendente("22HX", Dipartimento.PRODUZIONE);
		Dipendente andrea = new Dipendente("AAZ1", 2700.0, 53.0, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		System.out.println("Marco sei stato promosso a " + marco.promuovi());
		System.out.println("Luca sei stato promosso a " + luca.promuovi());
		
		System.out.println("---------------------------");
		System.out.println(marco.stampaDatiDipendente());
		System.out.println("---------------------------");
		System.out.println(giovanni.stampaDatiDipendente());
		System.out.println("---------------------------");
		System.out.println(luca.stampaDatiDipendente());
		System.out.println("---------------------------");
		System.out.println(andrea.stampaDatiDipendente());
		System.out.println("---------------------------");
		
		System.out.println("L'importo dovuto ai dipendenti è: " + (Dipendente.calcolaPaga(andrea, 5) + Dipendente.calcolaPaga(luca, 5) + Dipendente.calcolaPaga(giovanni, 5))+"€");
	}

}

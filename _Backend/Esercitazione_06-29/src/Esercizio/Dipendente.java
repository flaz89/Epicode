package Esercizio;

public class Dipendente {
	
	public double stipendioBase = 1000.0;
	
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento area;
	
	// CONSTRUCTORS ----------------------------------------------------------
	
	public Dipendente(String _matricola, Dipartimento _area) {
		this.matricola = _matricola;
		this.stipendio = this.stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.area = _area;
	}
	
	public Dipendente(String _matricola, double _stipendio, double _importoOrarioStraordinario, Livello _livello, Dipartimento _area) {
		this.matricola = _matricola;
		this.stipendio = _stipendio;
		this.importoOrarioStraordinario = _importoOrarioStraordinario;
		this.livello = _livello;
		this.area = _area;
	}
	
	// GETTER & SETTERS ----------------------------------------------------------

	public double getStipendio() {
		return this.stipendio;
	}
	
	public String matricola() {
		return this.matricola;
	}
	
	public double importoOrarioStraordinario() {
		return this.importoOrarioStraordinario;
	}

	private Livello getLivello() {
		return livello;
	}

	public void setLivello(Livello livello) {
		this.livello = livello;
	}

	private Dipartimento getArea() {
		return area;
	}

	public void setArea(Dipartimento area) {
		this.area = area;
	}

	
	// METODI ----------------------------------------------------------
	
	public String stampaDatiDipendente() {
		return "Dipendente:\nmatricola = " + this.matricola + "\nstipendio = " + stipendio + "€\nimportoOrarioStraordinario = "
				+ importoOrarioStraordinario + "€\nlivello = " + livello + "\narea = " + area ;
	}
	
	public Livello promuovi() {
		
		switch (this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio *= 1.2;
			break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio *= 1.5;
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio *= 2;
			break;
		default:
			System.out.println("Sei già dirigente, dai spazio ai giovani");
		}
		
		return this.livello;
	}
	
	public static void calcolaPaga(Dipendente employee) {
		System.out.println("La paga dell'utente: " + employee.getStipendio() + "€");
	}
	
	public static double calcolaPaga(Dipendente employee, double extra) {
		return employee.getStipendio(); 
	}
	
	
	
}

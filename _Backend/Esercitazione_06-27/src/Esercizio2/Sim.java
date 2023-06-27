package Esercizio2;

public class Sim {

	String phoneNumber;
	double credit = 0.0;
	Chiamata listCall[] = new Chiamata[5];

	//constructor
	public Sim(String number) {
		this.phoneNumber = number;
	}

	//methods
	public double ricarica(double num) {
		return credit += num;
	}

	public void stampaDati() {
		System.out.println(this.phoneNumber);
		System.out.println(this.credit);
		System.out.println();
		for (int i = 0; i < listCall.length; i++) {
		    if (listCall[i] != null) {
		        System.out.println("Il numero chiamato è: " + listCall[i].phoneCalled.toString() + " per una durata di " + listCall[i].timeCall);
		    }
		}
	}

	public void addCall(double time, String num) {
		int voidIndex = -1;

		for (int i = 0; i < listCall.length; i++) {
		    if (listCall[i] == null) {
		        voidIndex = i;
		        break;
		    }
		}
		
		if (voidIndex != -1) {
		    listCall[voidIndex] = new Chiamata(time, num);
		}
	}

}
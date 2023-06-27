package Esercizio2;

public class App {

	public static void main(String[] args) {

		Sim user1 = new Sim("3476684609");
		
		user1.ricarica(15);
		
		user1.addCall(15.7,"34566384500");
		user1.addCall(7,"34776384501");
		user1.addCall(11,"35773384109");
		user1.addCall(9,"35773384777");
		user1.addCall(3,"35663355757");
		
		user1.stampaDati();
		
	}

}

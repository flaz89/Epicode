package Esercizio3;

public class Cliente {
	String clientAccount;
	String clientName;
	String clientSurname;
	String clientEmail;
	String clientSubscriptionDate;
	
	public Cliente(String account, String name, String surname, String mail, String date) {
		this.clientAccount = account;
		this.clientName = name;
		this.clientSurname = surname;
		this.clientEmail = mail;
		this.clientSubscriptionDate = date;
	}
	
	public void customerAccount() {
		System.out.println("Dati utente");
	}

}

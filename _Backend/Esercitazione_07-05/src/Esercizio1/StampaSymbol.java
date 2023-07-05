package Esercizio1;

public class StampaSymbol extends Thread {
	String symbol;
	
	public StampaSymbol(String str) {
		this.symbol = str;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(this.symbol);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}

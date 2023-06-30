package multimedia_player;

public class Image extends Multimedia implements Luminosity {
	
	private int luminosity;
	
	public Image(String title, int _luminosity) {
		super(title);
		this.luminosity = _luminosity;
	}
	
	// GETTERS & SETTERS -------------------------------

	public int getLuminosity() {
		return this.luminosity;
	}



	public void setLuminosity(int luminosity) {
		this.luminosity = luminosity;
	}

	// METHODS FROM INTERFACE ---------------------------

	@Override
	public void lowLuminosity() {
		this.luminosity--;
		
	}

	@Override
	public void highLuminosity() {
		this.luminosity++;
		
	}
	
	// CLASS METHODS
	
	public void show() {
		String luminosityString = "*".repeat(this.luminosity);
		for (int i = 0; i < getLuminosity(); i++) {
	        System.out.println(this.title + " " + luminosityString);
	    }
	}
}

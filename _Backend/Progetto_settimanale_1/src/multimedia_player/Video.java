package multimedia_player;

public class Video extends Multimedia implements Volume, Luminosity {
	
	private int time;
	private int volume;
	private int luminosity;
	
	public Video(String title, int _time, int _volume, int _luminosity) {
		super(title);
		this.time = Math.abs(_time);
		this.volume = Math.abs(_volume);
		this.luminosity = _luminosity;
	}
	
	// GETTERS & SETTERS -------------------------------

	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}



	public int getVolume() {
		return volume;
	}



	public void setVolume(int volume) {
		this.volume = volume;
	}



	public int getLuminosity() {
		return luminosity;
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

	@Override
	public void lowVolume() {
		this.volume--;
	}

	@Override
	public void highVolume() {
		this.volume++;
	}

	@Override
	public void play() {
		String volumeString = "!".repeat(volume);
	    String luminosityString = "*".repeat(this.luminosity);

	    for (int i = 0; i < getTime(); i++) {
	        System.out.println(title + " " + volumeString + luminosityString);
	    }
		
	}
	
	
	
	
	

}

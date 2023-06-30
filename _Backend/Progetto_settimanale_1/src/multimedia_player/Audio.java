package multimedia_player;

public class Audio extends Multimedia implements Volume, Luminosity {
	
	private int time;
	private int volume;
	
	public Audio(String title, int _time, int _volume ) {
		super(title);
		this.time = Math.abs(_time);
		this.volume = Math.abs(_volume);
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

	// METHODS FROM INTERFACE ---------------------------

	@Override
	public void lowLuminosity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void highLuminosity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lowVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void highVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		String volumeString = "!".repeat(volume);

	    for (int i = 0; i < getTime(); i++) {
	        System.out.println(title + " " + volumeString);
	    }
		
	}
}

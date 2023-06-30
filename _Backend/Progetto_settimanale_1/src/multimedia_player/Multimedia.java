package multimedia_player;

public abstract class Multimedia {
	protected String title;
	
	public Multimedia(String _title) {
		this.title = _title;
	}
	

	public String getTitle() {
		return this.title;
	}
	
}

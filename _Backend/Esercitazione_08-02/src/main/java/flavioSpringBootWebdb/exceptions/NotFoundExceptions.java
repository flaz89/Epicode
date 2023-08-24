package flavioSpringBootWebdb.exceptions;

import java.util.UUID;

public class NotFoundExceptions extends RuntimeException {

	public NotFoundExceptions(String message) {
		super(message);
	}
	
	public NotFoundExceptions(UUID id) {
		super(id + " non trovato!");
	}
	
}

package client;
import java.io.Serializable;

public class Message implements Serializable {

	protected static final long serialVersionUID = 1112122200L;
	public static final int MESSAGE = 0;
	public static final int LOGOUT = 1;
	private int type;
	private String message;
	
	// constructor
	Message(int type, String message) {
		this.type = type;
		this.message = message;
	}

	// getters
	public int getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}
}

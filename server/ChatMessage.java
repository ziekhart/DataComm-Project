package server;
import java.io.*;

public class ChatMessage implements Serializable {

	protected static final long serialVersionUID = 1112122200L;
	static final int WHO = 0;
	static final int MESSAGE = 1;
	static final int LOGOUT = 2;
	private int type;
	private String message;
	
	// constructor
	ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}

	// getters
	int getType() {
		return type;
	}

	String getMessage() {
		return message;
	}
}

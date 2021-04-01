package bcu.s17116575.adventure.effects;

public class Message {
	static String message;

	public Message(String message) {
		// Implement constructor
		Message.message = message;
		//Message to be printed
		System.out.println(message);
	}
}

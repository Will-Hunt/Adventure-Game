package bcu.s17116575.adventure.game;

/**
 * When committed the program is stopped,
 * and the game is quit.
 * 
 * @author William Hunt
 * @see Main
 */

public class QuitException extends Exception {
	public  QuitException(){
		System.exit(0);
		return;
	}
}

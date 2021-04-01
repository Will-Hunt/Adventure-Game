package bcu.s17116575.adventure.game;

import bcu.s17116575.adventure.effects.DoAction;
import bcu.s17116575.adventure.effects.DropItem;
import bcu.s17116575.adventure.effects.Effect;
import bcu.s17116575.adventure.effects.GoDirection;
import bcu.s17116575.adventure.effects.LookItem;
import bcu.s17116575.adventure.effects.LookLocation;
import bcu.s17116575.adventure.effects.Message;
import bcu.s17116575.adventure.effects.ShowInventory;
import bcu.s17116575.adventure.effects.TakeItem;

/**
 * CommandParser displaying determining the actions of the player depending on the input
 * <p>
 * If a player needs help then the class outputs the Help_Message
 * <p>
 * 
 * @author William Hunt
 * @see game
 */
public class CommandParser {
	
	public static final String HELP_MESSAGE =
		"Commands:\n" +
		"    look              Look around you.\n" +
		"    look [item]       Look at an item.\n" +
		"    inventory         Look at your inventory.\n" +
		"    go [direction]    Walk in a direction.\n" +
		"    take [item]       Take an item.\n" +
		"    drop [item]       Drop an item.\n" +
		"    help              Show this help message.\n" +
		"    quit              Exit the game.";
	
	public static Effect parsePlayerCommand(String command) {
		// TODO: complete implementation of parsePlayerCommand
		/**
		 * This method compares the users input against the iterative statement 
		 * to determine the action taken in the game. Otherwise the user is prompted to enter the input again.
		 */
		command = command.toLowerCase();
		if("look".equals(command)) {
		return new LookLocation();
		}else if(command.startsWith("look ")){
		return new LookItem(command.substring(S));	
		}else if("inventory".equals(command)) {
		return new ShowInventory();
		}else if(command.startsWith("go ")) {
		return new GoDirection(command.substring(3));
		}else if(command.startsWith("take ")) {
		return new TakeItem(command.substring(S));
		}else if(command.startsWith("drop "))
		return new DropItem(command.substring(S));
		}else if("help".equals(command)) {
		return new Message(HELP_MESSAGE);
		}else if("quit".equals(command)) {
		return new Quit();
		}else {
		return new DoAction(command);
		}
	}
}

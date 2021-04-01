package bcu.s17116575.adventure.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bcu.s17116575.adventure.effects.Effect;

/**
 * Commits the Action needed by the player
 * <p>
 * Names of Actions are case-insensitive when used to get, update or remove an
 * entry, but the player must be allowed to do this Action.
 * <p>
 * 
 * @author William Hunt
 * @see effects
 */

public class Action {
	/**
	 * Declaring variables for the Action class.
	 * 
	 * @param name
	 * @param allEffects ArrayList
	 */
	private final String name;
	private final static List<Effect> allEffects = new ArrayList<>();
	
	/**
	 * Declares the Constructor.
	 * 
	 * @param name Name of the Action
	 * */
	public Action(String name) {
		// TODO: implement constructor
		this.name = name;
	}
	
	/**
	 * A getter method for the name of the Action.
	 * 
	 * @return name Name of the Action
	 */
	public String getName() {
		// TODO: implement getName method
		return name;
	}
	
	/**
	 * Adds the required Item to an Action.
	 * 
	 * @param Item  Item Name and Description 
	 * @param player The player of the game
	 * @throws IllegalArgumentException if the Player cannot be found.
	 */
	public void addRequiredItem(Item item) {
		// TODO: implement addRequiredItem method
		allEffects.add((Effect) item);
		Player player = null;
		// only adds the new item to allItems if it doesn't excites
		if(isAllowed(player)) {
			allEffects.add((Effect) item);
		}else {
			throw new IllegalArgumentException("Sorry there is no player.");
		}
	}
	
	/**
	 * Method to determine whether a player can use a effect or not.
	 * 
	 * @return isAllowed 
	 * */
	public static boolean isAllowed(Player player) {
		// TODO: implement isAllowed method
		boolean isAllowed;
		if (getEffects() == null) {
			// you have to set a variable that is true if the condition is met
			isAllowed = false;
		}else {
			isAllowed = true;
		}
		return isAllowed;	}
	
	/**
	 * Adds the required Item to an Action.
	 * 
	 * @param effect
	 */
	public void addEffect(Effect effect) {
		// TODO: implement addEffect method
		if(!(getEffects() == null)) {
			allEffects.add(effect);
		}
	}
	
	/**
	 * Returns a list of all Effects.
	 * <p>
	 * The list returned is in alphabetical order, and is unmodifiable.
	 * 
	 * @return the list of effects
	 */
	public static List<Effect> getEffects() {
		// TODO: implement getEffects method
		return Collections.unmodifiableList(allEffects);
	}
}

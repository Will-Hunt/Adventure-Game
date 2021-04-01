package bcu.s17116575.adventure.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Commits the Player and what that player can do
 * <p>
 * 
 * @author William Hunt
 * @see effects
 */

public class Player {
	/**
	 * Declaring variables for the Action class.
	 * @param description 
	 * @param locaiton
	 * @param inventory ArrayList
	 */
	public static String description;
	private Location location;
	private final static List<Item> inventory = new ArrayList<>();

	/**
	 * Declares the Constructor.
	 * 
	 * @param location Location of the Player
	 * */
	public Player(Location location) {
		this.location = location; 
	}
	
	/**
	 * A getter method for the Location of the Player.
	 * 
	 * @param location Location of the Player
	 * */
	public Location getLocation() {
		// TODO: implement getLocation method
		return location;
	}
	
	/**
	 * Setter Method for the Location.
	 * 
	 * @param location of the Player
	 * */
	public void setLocation(Location location) {
		// TODO: implement setLocation method
		this.location = location; 
	}
	
	/**
	 * Takes the required Item to an Location.
	 * 
	 * @throws IllegalArgumentException if the item isn't at the location
	 * @param item Takes the Item 
	 */
	public static void takeItem(Item item) {
		// TODO: implement takeItem method
		if(item == null) {
			throw new IllegalArgumentException("This item cannot be taken.");
		}else {
			inventory.add(item);
		}
	}
	
	/**
	 * Method to determine whether a player can use a item or not.
	 * 
	 * @return hasItem 
	 * */
	public boolean hasItem(Item item) {
		// TODO: implement hasItem method
		boolean hasItem;
		if (getInventory(item) = null) {
			// you have to set a variable that is true if the condition is met
			hasItem = false;
		}else {
			hasItem = true;
		}
		return hasItem;
	}
	
	/**
	 * Method to determine whether a player can see a item or not.
	 * 
	 * @return canSee Determines if the user can see the item  
	 * */
	public static boolean canSeeItem(Item item) {
		// TODO: implement canSeeItem method
		boolean canSee;
		if (getInventory() == null && Location.getAllDirections() == null) {
			// you have to set a variable that is true if the condition is met
			canSee = false;
		}else {
			canSee = true;
		}
		return canSee;
	}
	
	/**
	 * Drops the required Item from a Location.
	 * 
	 * @param item The Item in that Player
	 * @throws IllegalArgumentException if the Item cannot be found.
	 */
	public static void dropItem(Item item) {
		// TODO: implement dropItem method
		if(getInventory() == null) {
			throw new IllegalArgumentException("This item can't be removed, as it doesn't excits.");
		}else {
			inventory.remove(item);
		}
	}
	
	/**
	 * Returns a list of the inventory.
	 * <p>
	 * The list returned is in alphabetical order, and is unmodifiable.
	 * 
	 * @return the list of inventory items
	 */
	public static List<Item> getInventory() {
		// TODO: implement getInventory method
		return Collections.unmodifiableList(inventory);
	}
}

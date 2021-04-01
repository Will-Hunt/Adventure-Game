package bcu.s17116575.adventure.model;

import java.util.*;
/**
 * Commits the Location needed by the player
 * <p>
 * Names of Locations are case-insensitive when used to get, update or remove an
 * entry.
 * <p>
 * 
 * @author William Hunt
 * @see effects
 */
public class Location {
	/**
	 * Declaring variables for the Location class.
	 * @param name
	 * @param description
	 * @param allDirections HashSet
	 * @param allItems ArrayList
	 */
	private final String name;
	private final String description;
	@SuppressWarnings("unused")
	private String direction; 
	private final static Set<String> allDirections = new HashSet<>();	
	private final static List<Item> allItems = new ArrayList<>();

	/**
	 * Declares the Constructor.
	 * 
	 * @param name Name of the Location
	 * @param description Description of the Location
	 * */
	public Location(String name, String description) {
		// TODO: implement constructor
		this.name = name;
		this.description = description; 
	}
	
	/**
	 * A getter method for the name of the Location.
	 * 
	 * @param name Name of the Location
	 * */
	public String getName() {
		// TODO: implement getName method
		return name;
	}
	
	/**
	 * A getter method for the description of the Location.
	 * 
	 * @param description Description of the Location
	 * */
	public String getDescription() {
		// TODO: implement getDescription method
		return description;
	}
	
	/**
	 * Adds the required Neighbour to an Location.
	 * 
	 * @param direction direction of the Neighbour 
	 * @param neighbour respective neighbour
	 */
	public void addNeighbour(String direction, Location neighbour) {
		// TODO: implement addNeighbour method
		neighbour.addNeighbour(direction, neighbour);
	}
	
	/**
	 * A getter method for the direction of the Neighbour.
	 * 
	 * @param location direction for the Location
	 * */
	public static Location getNeighbour(String direction) {
		// TODO: implement getNeighbour method
		if(allDirections == null) {
			return null;
		}else {
			return (Location) getAllDirections();
		}
	}
	
	/**
	 * Returns a collection of all Directions.
	 * 
	 * @return the collection of directions
	 */
	public static Collection<String> getAllDirections() {
		// TODO: implement getAllDirections method
		return Collections.unmodifiableCollection(allDirections);
	}
	
	/**
	 * Returns a list of all Items.
	 * <p>
	 * The list returned is in alphabetical order, and is unmodifiable.
	 * 
	 * @return the list of effects
	 */
	public static List<Item> getItems(Item item) {
		// TODO: implement getItems method
		return Collections.unmodifiableList(allItems);
	}
	
	/**
	 * Adds the required Item to an Location.
	 * 
	 * @param item Adds the item 
	 */
	public static void addItem(Item item) {
		if(!hasItem(item)) {
			allItems.add(item);
		}
	}
	
	/**
	 * Method to determine whether a player can use a item or not.
	 * 
	 * @return hasItem 
	 * */
	public static boolean hasItem(Item item) {
		// TODO: implement hasItem method
		boolean hasItem;
		if (getItems(item) == null) {
			// you have to set a variable that is true if the condition is met
			hasItem = false;
		}else {
			hasItem = true;
		}
		return hasItem;
	}
	
	/**
	 * Removes the required Item from a Location.
	 * 
	 * @param item The Item in that Location
	 * @throws IllegalArgumentException if the Item cannot be found.
	 */
	public static void removeItem(Item item) {
		// TODO: implement removeItem method
		if(getItems(item) == null) {
			throw new IllegalArgumentException("This item can't be removed, as it doesn't excits.");
		}else {
			allItems.remove(item);
		}
	}
}

package bcu.s17116575.adventure.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

import bcu.s17116575.adventure.effects.Effect;

/**
 * Commits the World and what that player can do in that World
 * <p>
 * 
 * @author William Hunt
 * @see effects
 */
public class World {
	/**
	 * Declaring variables for the Action class.
	 * @param name
	 * @param description
	 * @param getStartEffect ArrayList
	 * @param getItem HashMap
	 * @param getLocation HashMap
	 * @param getAction HashMap
	 * @param description
	 * 
	 */	
	private final String name;
	private final String desciption;
	List<Effect> getStartEffect = new ArrayList<>();
	Map<String, Item> getItem = new HashMap<>();
	Map<String, Location> getLocation = new HashMap<>();
	Map<String, Action> getAction = new HashMap<>();
	private Object description;
	
	/**
	 * Declares the Constructor.
	 * 
	 * @param name Name of the World
	 * @param description Description of a World
	 * */
	public World(String name, String description) {
		// TODO: implement constructor
		this.name = name;
		this.description = description;
	}
	
	/**
	 * A getter method from the Location for the startingLocation.
	 * 
	 * @param getLocation
	 * */
	public Location getStartingLocation() {
		Item location;
		// TODO: implement getStartingLocation method
		return location.getLocation();
	}
	
	/**
	 * Setter Method for the  Starting Location.
	 * 
	 * @param the list of locations
	 * */
	public void setStartingLocation(Location location) {
		// TODO: implement setStartingLocation method
		Set<String> location = new HashSet<>();
		location.addAll(Location.addNeighbour(neighbour));
		return Collections.unmodifiableSet(location);
	}
	
	/**
	 * A getter method for the Item.
	 * 
	 * @return name The name of the Item desired. 
	 * */
	public static Item getItem(String name) {
		// TODO: implement getItem method
		if(name == null) {
			return null;
		}else {
			return getItem(name);
		}
	}
	
	/**
	 * Adds the required Item to an Action.
	 * 
	 * @param Item  Item to be added 
	 * @param name What	the Item is called
	 * @param description What the Item is 
	 * @throws IllegalArgumentException if the Player cannot be found.
	 */
	public Item addItem(String name, String description) {
		// TODO: implement addItem method
		for(Item other : allDirections) {
			if(other.dominates(item)) {
				throw new IllegalArgumentException("This item already excist.");
			}else {
				return Item.addItem(name, description);
			}
		}
	}
	
	/**
	 * A getter method for the name of the Items Location.
	 * 
	 * @return name The location of the the Item
	 */
	public Location getLocation(String name) {
		// TODO: implement getLocation method
		if(name == null) {
			return null;
		}else {
			return Location.getName(name);
		}	
	}
	/**
	 * Adds the required Location to the game World.
	 * 
	 * @param Item  Item Name and Description 
	 * @param name What	the Item is called
	 * @param description What the Item is
	 * @throws IllegalArgumentException if the Location already excists.
	 */
	public Location addLocation(String name, String description) {
		// TODO: implement addLocation method
		for(Location other : allDirections) {
			if(other.dominates(location)) {
				throw new IllegalArgumentException("This Location already excist.");
			}else {
				return Location.addLocation(name, description);
			}
		}
	}
	
	/**
	 * A getter method for the Action.
	 * 
	 * @return name Name of the Action
	 */
	public Action getAction(String name) {
		// TODO: implement getAction method
		if(name == null) {
			return null;
		}else {
			return Action.getAction(name);
		}	
	}
	
	/**
	 * Adds the required Item to an Action.
	 * 
	 * @param name  Name of the Action 
	 * @throws IllegalArgumentException if the Player cannot be found.
	 */
	public Action addAction(String name) {
		// TODO: implement addAction method
		for(Action other : allDirections) {
			if(other.dominates(action)) {
				throw new IllegalArgumentException("This Action already excist.");
			}else {
				return Action.addAction(name);
			}
		}	}
	
	public void onStart(Effect effect) {
		// TODO: implement onStart method
		
	}
	
	/**
	 * Returns a list of the starting Effects.
	 * <p>
	 * The list returned is in alphabetical order, and is unmodifiable.
	 * 
	 * @return the list of starting effects
	 */
	public List<Effect> getStartEffects() {
		// TODO: implement getStartEffects method
		return Collections.unmodifiableSet(effect);
	}
}

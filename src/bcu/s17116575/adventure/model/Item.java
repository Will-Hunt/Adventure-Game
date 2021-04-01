package bcu.s17116575.adventure.model;
/**
 * Commits the Item needed by the player
 * <p>
 * Names of Items are case-insensitive when used to get, update or remove an
 * entry, but the player must be allowed to use this Item.
 * <p>
 * 
 * @author William Hunt
 * @see Main
 */
public class Item {
	/**
	 * Declaring variables for the Action class.
	 * 
	 * @param name
	 * @param description
	 * @param location
	 * @param portable
	 */
	private String name;
	private String description;
	@SuppressWarnings("unused")
	private Location location;
	@SuppressWarnings("unused")
	private Boolean portable;
	
	public Item(String name, String description, String location, Boolean portable) {
		/**
		 * Declares the Constructor.
		 * 
		 * @param name Name of the Item
		 * @param description Description of the Item
		 * @param portable Whether or not a Item is portable
		 * */
		this.name =name;
		this.description = description; 
		this.portable = portable;
	}
	
	/**
	 * A getter method for the name of the Item.
	 * 
	 * @return name Name of the Item
	 * */
	public String getName() {
		// TODO: implement getName method
		return name;
	}
	
	/**
	 * A getter method for the description of the Item.
	 * 
	 * @return description Description of the Item
	 * */
	public String getDescription() {
		// TODO: implement getDescription method
		return description;
	}
	/**
	 * A getter method for the location of the Item.
	 * 
	 * @return getLocation location of the Item
	 * */
	public Location getLocation() {
		// TODO: implement getLocation method
		return getLocation();
	}
	
	/**
	 * Setter Method for the Location.
	 * 
	 * @param location of the Item
	 * */
	public void setLocation(Location location) {
		// TODO: implement setLocation method
		this.location = location;
	}
	
	/**
	 * Method to determine whether a item is portable or not.
	 * 
	 * @return portable 
	 * */
	public boolean isPortable(Item portable) {
		// TODO: implement isPortable method
		return (this.portable = portable.isPortable(portable));
	}
	
	/**
	 * Setter Method for the portable.
	 * 
	 * @param portable portability of the Item
	 * */
	public void setPortable(boolean portable) {
		// TODO: implement setPortable method
		this.portable = portable;
	}

	/**
	 * Adds the required Item.
	 * 
	 * @param item
	 */
	public static void addItem(String string, String string2) {
		// TODO Auto-generated method stub
		if(!(getName(string) == null)) {
			allItems.add(string);
		}
	}
}

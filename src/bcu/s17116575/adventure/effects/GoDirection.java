package bcu.s17116575.adventure.effects;

import bcu.s17116575.adventure.model.Location;

public abstract class GoDirection implements Effect {
	@SuppressWarnings("unused")
	private String name = null;
	@SuppressWarnings("unused")
	private boolean hasItem = false;
	@SuppressWarnings("unused")
	private String message = null;
	
	public GoDirection(String name) {
		//Implement constructor
		this.name = name;
	}
	
	public String goDirection(String direction) {
		getNeighbour = Location.getNeighbour(direction);
		if (hasItem = true) {
			Player.dropItem(item);
			message = ("The Item was dropped.");
		}else {
			message = ("Sorry, you cannot move in this diretion.");
		}
		return Message.message;
	}
}

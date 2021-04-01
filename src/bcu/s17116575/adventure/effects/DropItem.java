package bcu.s17116575.adventure.effects;

import bcu.s17116575.adventure.model.Item;
import bcu.s17116575.adventure.model.Location;
import bcu.s17116575.adventure.model.Player;

public abstract class DropItem implements Effect {
	@SuppressWarnings("unused")
	private String name = null;
	@SuppressWarnings("unused")
	private boolean hasItem = false;
	@SuppressWarnings("unused")
	private String message = null;
	
	public DropItem(String name) {
		//Implement constructor
		this.name = name;
	}
	
	public String dropItem(Item item) {
		hasItem = Player.canSeeItem(item);
		if (hasItem = true) {
			Player.dropItem(item);
			Location.addItem(item);
			message = ("The Item was dropped.");
		}else {
			message = ("Sorry, The Item couldn't be dropped.");
		}
		return Message.message;
	}
	
	
}

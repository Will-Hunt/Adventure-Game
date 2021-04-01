package bcu.s17116575.adventure.effects;

import bcu.s17116575.adventure.model.Item;
import bcu.s17116575.adventure.model.Player;

public abstract class LookItem implements Effect {	
	@SuppressWarnings("unused")
	private final String name;
	@SuppressWarnings("unused")
	private boolean hasItem = false;
	@SuppressWarnings("unused")
	private String message = null;

	public LookItem(String name) {
		//Implement constructor
		this.name = name;
	}
	
	public String canSeeItem(Item item) {
		hasItem = Player.canSeeItem(item);
		if (hasItem = true) {
			message = ("You can see this Item.");
		}else {
			message = ("Sorry, you can't see this Item.");
		}
		return Message.message;
	}
	
}

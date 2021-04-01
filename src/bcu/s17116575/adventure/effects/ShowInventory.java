package bcu.s17116575.adventure.effects;

import java.util.ArrayList;
import java.util.List;

import bcu.s17116575.adventure.model.Item;

public class ShowInventory implements Effect {
	@SuppressWarnings("unused")
	private void showInventory(){
		List<Item> inventory = new ArrayList<>();
		if(inventory == null) {
			System.out.println("Sorry, your inventory is empty");
		}else {
			System.out.println("Your invotory contains the follwoing item: ");
		    for(Item item : inventory) {
		        System.out.println(item.getName());
		    }
		}	
	}
}

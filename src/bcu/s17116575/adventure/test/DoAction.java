package bcu.s17116575.adventure.test;

import org.junit.Test;

import bcu.s17116575.adventure.model.Action;
import bcu.s17116575.adventure.model.Location;
import bcu.s17116575.adventure.model.Player;

import static org.junit.Assert.*;

public class DoAction {
	private final Action TakeItem = new Action("TakeItem");
	private final Location cottage = new Location("cottage", "You are in a town cottage.");
	private final Player Test = new Player(cottage);
	

	
	@Test
	public void testGetName() {
		assertEquals("TakeItem", TakeItem.getName());
	}
	
	@Test
	public void testIsAllowed() {
		assertEquals(true, Action.isAllowed(Test));
	}

	
	// TODO: more unit tests
}

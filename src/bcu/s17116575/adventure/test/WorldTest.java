package bcu.s17116575.adventure.test;

import org.junit.Test;

import bcu.s17116575.adventure.model.Action;
import bcu.s17116575.adventure.model.Item;
import bcu.s17116575.adventure.model.World;

import static org.junit.Assert.*;

public class WorldTest {
	private final Item clock = new Item("clock", "It is an old grandfather clock.", null, null);
	
	@Test
	public void testGetItem() {
		assertEquals("clock", World.getItem("clock"));
	}
	
	@Test
	public void testIsAllowed() {
		assertEquals(true, Action.isAllowed("Test"));
	}
	
	@Test
	public void testAddITem() {
		Item.addItem("pan", "This is a cooking utensil.");
		assertEquals("pan", Item.getName("pan"));
	}
	
	// TODO: more unit tests
}

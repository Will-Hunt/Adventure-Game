package bcu.s17116575.adventure.test;

import org.junit.Test;

import bcu.s17116575.adventure.model.Item;
import bcu.s17116575.adventure.model.Location;

import static org.junit.Assert.*;

public class ItemTest {
	private final Item clock = new Item("clock", "It is an old grandfather clock.", null, null);
	private final Item pan = new Item("pan", "It is an cooking pan.", null, null);
	
	@Test
	public void testGetName() {
		assertEquals("clock", clock.getName());
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("It is an old grandfather clock.", clock.getDescription());
	}
	
	@Test
	public void testGetName2() {
		assertEquals("pan", pan.getName());
	}
	
	@Test
	public void testGetDescription2() {
		assertEquals("It is an cooking pan.", pan.getDescription());
	}
	@Test
	public void testSetPortable() {
		clock.setPortable(false);
		assertTrue(clock.isPortable(clock));
	}
	
	@Test
	public void testSetPortable2() {
		pan.setPortable(false);
		assertTrue(pan.isPortable(pan));
	}
	
	@Test
	public void testLocation() {
		Location house = new Location("house", "You are in a small village house.");
		clock.setLocation(house);
		assertSame(house, clock.getLocation());
	}
	
	// TODO: more unit tests
}

package bcu.s17116575.adventure.test;

import org.junit.Test;

import bcu.s17116575.adventure.model.Location;

import static org.junit.Assert.*;

import java.util.Collections;

public class LocationTest {
	private final Location house = new Location("house", "You are in a small village house.");
	private final Location cottage = new Location("cottage", "You are in a town cottage.");

	@Test
	public void testGetName() {
		assertEquals("house", house.getName());
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("You are in a small village house.", house.getDescription());
	}
	
	@Test
	public void testGetName2() {
		assertEquals("cottage", cottage.getName());
	}
	
	@Test
	public void testGetDescription2() {
		assertEquals("You are in a town cottage.", cottage.getDescription());
	}
	
	@Test
	public void noItems() {
		assertEquals(Collections.emptyList(), Location.getItems(null));
	}
	
	// TODO: more unit tests
}

package bcu.s17116575.adventure.test;

import org.junit.Test;

import bcu.s17116575.adventure.model.Location;
import bcu.s17116575.adventure.model.Player;

import static org.junit.Assert.*;

import java.util.Collections;

public class PlayerTest {
	private final Location house = new Location("house", "You are in a small village house.");
	private final Location street = new Location("street", "You are on the main street of the village.");
	private final Player player = new Player(street);
	
	@Test
	public void testGetLocation() {
		assertSame(street, player.getLocation());
	}
	
	@Test
	public void testSetLocation() {
		player.setLocation(house);
		assertSame(house, player.getLocation());
	}
	
	@Test
	public void testInventory() {
		assertEquals(Collections.emptyList(), Player.getInventory());
	}
	
	// TODO: more unit tests
}

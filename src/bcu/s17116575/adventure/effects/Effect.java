package bcu.s17116575.adventure.effects;

import bcu.s17116575.adventure.model.Player;
import bcu.s17116575.adventure.model.World;

public interface Effect {
	public void execute(Player player, World world);
}

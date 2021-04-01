package bcu.s17116575.adventure.effects;

import bcu.s17116575.adventure.game.QuitException;

public class Quit {
	public Quit() throws QuitException {
		throw new QuitException();
	}
}

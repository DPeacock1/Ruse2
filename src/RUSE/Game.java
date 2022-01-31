package RUSE;

import Factions.facRUS;
import Factions.facUSA;
import Maps.Gorodok;
import Maps.RUSEMap;

public class Game {

	private RUSEMap map;
	private Player[] players;
	
	public Game(Player[] players, RUSEMap map) {
		this.players = players;
		this.map = map;
	}

	public static void main(String[] args) {
		Player[] players = {new Player("Squiders", new facUSA()), new Player("s4mdr0id", new facRUS())};
		RUSEMap map = new Gorodok();
		Game game = new Game(players, map);
	}

}

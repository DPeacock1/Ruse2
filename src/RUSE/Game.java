package RUSE;

import java.util.Scanner;

import javax.vecmath.Point2d;

import Factions.facRUS;
import Factions.facUSA;
import Maps.Gorodok;
import Maps.RUSEMap;
import Units.USA.M60_Patton;

public class Game {

	private RUSEMap map;
	private Player[] players;
	private long time;
	
	public Game(Player[] players, RUSEMap map) {
		this.players = players;
		this.map = map;
		time = 0;
	}

	public static void main(String[] args) {
		Player[] players = {new Player("Squiders", new facUSA()), new Player("s4mdr0id", new facRUS())};
		Gorodok map = new Gorodok();
		Game game = new Game(players, map);
		
		players[0].getFaction().spawnUnit(new M60_Patton(game, new Point2d(0,0), null, null));
		
		while (true) {
			
		}
	}

	public long getTime() {
		return time;
	}
	
}

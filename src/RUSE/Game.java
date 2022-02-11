package RUSE;

import java.util.Scanner;

import javax.vecmath.Point2d;

import Factions.facRUS;
import Factions.facUSA;
import GUI.Window;
import Maps.Gorodok;
import Maps.RUSEMap;
import Units.USA.M60_Patton;

public class Game {

	private RUSEMap map;
	private Player[] players;
	private Window window;
	private long time;
	private boolean running = true;

	public Game(Player[] players, RUSEMap map) {
		this.players = players;
		this.map = map;
		time = 0;
	}

	public static void main(String[] args) {
		Player[] players = { new Player("Squiders", new facUSA()), new Player("s4mdr0id", new facRUS()) };
		Gorodok map = new Gorodok();
		Game game = new Game(players, map);
		
		players[0].getFaction().spawnUnit(new M60_Patton(game, new Point2d(0, 0), null, null));
		
		game.startGUI();
		game.startGame();
	}
	
	public void startGame() {
		while (running) {
			for (Player player: players) {
				player.tick(0);
			}
		}
	}
	
	public void stopGame() {
		running = false;
		System.out.println("Game ended");
	}

	public long getTime() {
		return time;
	}

	public void startGUI() {
		window = new Window(this);
	}
}

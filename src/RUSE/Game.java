package RUSE;

public class Game {

	private RUSEMap map;
	private Player[] players;
	
	public Game(Player[] players, RUSEMap map) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Player[] players = {new Player(new facUSA()), new Player(new facRUS())};
		RUSEMap map = new Gorodok();
		Game game = new Game(players, map);
	}

}

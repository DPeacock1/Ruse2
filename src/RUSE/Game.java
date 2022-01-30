package RUSE;

public class Game {

	private RUSEMap map;
	private Player[] players;
	
	public Game(Player[] players, RUSEMap map) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Player player1 = new Player(new Faction(Factions.USA));
		Player player2 = new Player(new Faction(Factions.RUS));
		RUSEMap map = new Gorodok();
		Game game = new Game(player1, player2, map);
	}

}

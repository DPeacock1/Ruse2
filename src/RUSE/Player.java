package RUSE;

import Factions.Faction;
import Units.Unit;

public class Player {
	
	private String name;
	private Faction faction;

	public Player(String name, Faction faction) {
		this.name = name;
		this.faction = faction;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Faction getFaction() {
		return faction;
	}
	
}

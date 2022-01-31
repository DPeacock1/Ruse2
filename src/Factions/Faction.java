package Factions;

import Units.Unit;

public abstract class Faction {
	
	protected Unit[] AvailableUnits;
	protected Unit[] ActiveUnits;
	
	public Faction() {
		
	}
	
	public Unit[] getAvailableUnits() {
		return AvailableUnits;
	}
	
	public Unit[] getActiveUnits() {
		return ActiveUnits;
	}
	
	public void setActiveUnits(Unit[] ActiveUnits) {
		this.ActiveUnits = ActiveUnits;
	}
	
	public void setAvailableUnits(Unit[] AvailableUnits) {
		this.AvailableUnits = AvailableUnits;
	}
}

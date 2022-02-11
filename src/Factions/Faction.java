package Factions;

import java.util.ArrayList;
import java.util.Arrays;

import RUSE.Player;
import Units.Unit;

public abstract class Faction {

	protected ArrayList<Class<? extends Unit>> AvailableUnits;
	protected ArrayList<Unit> ActiveUnits;
	protected String factionName;

	public Faction() {
		
	}
	
	public void tick(double dT) {
		for (Unit unit: ActiveUnits) {
			unit.tick(dT);
		}
	}
	
	public String getFactionName () {
		return factionName;
	}

	public void checkDestroyedUnits() {

		for (int i = 0; i < ActiveUnits.size(); i++) {
			if (ActiveUnits.get(i).getHealth() <= 0) {
				ActiveUnits.remove(i);
				i--;
			}
		}
	}

	public Unit[] getAvailableUnits() {
		return (Unit[]) AvailableUnits.toArray();
	}

	public Unit[] getActiveUnits() {
		return (Unit[]) ActiveUnits.toArray();
	}

	public void setActiveUnits(Unit[] ActiveUnits) {
		this.ActiveUnits = new ArrayList<Unit>(Arrays.asList(ActiveUnits));
	}

	public void spawnUnit(Unit unit) throws IllegalArgumentException {
		if (AvailableUnits.contains(unit.getClass())) {
			ActiveUnits.add(unit);
		} else {
			throw new IllegalArgumentException(Unit.class + " is not an available unit for " + factionName);
		}
	}

	public void setAvailableUnits(Class<? extends Unit>[] AvailableUnits) {
		this.AvailableUnits = new ArrayList<Class<? extends Unit>>(Arrays.asList(AvailableUnits));
	}
}

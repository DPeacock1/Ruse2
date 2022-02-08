package Factions;

import Units.Unit;
import Units.USA.M60_Patton;

public class facUSA extends Faction {

	public facUSA() {
		factionName = "USA";
		setAvailableUnits(new Class[] { M60_Patton.class });
	}

}

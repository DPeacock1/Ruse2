package Factions;

import Units.Unit;
import Units.USA.M60_Patton;

public class facUSA extends Faction {

	public facUSA() {
		AvailableUnits = new Unit[] { new M60_Patton(null, null) };
	}

}

package terrain;

import java.awt.Color;

public class DirtRoad extends Ground{
	
	public DirtRoad() {
		setColor(Color.gray);
		groundSpeedMultiplier = 1.5;
	}
}

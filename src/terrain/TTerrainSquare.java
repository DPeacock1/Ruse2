package terrain;

import java.awt.Color;

public abstract class TTerrainSquare {

	protected Color color;
	protected Double terrainSpeedMultiplier; 
	
	public TTerrainSquare() {
		setColor(color.white);
	}
	
	protected void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

}

package terrain;

import java.awt.Color;

public abstract class TerrainSquare {

	protected Color color;
	protected Double terrainSpeedMultiplier; 
	
	public TerrainSquare() {
		setColor(color.white);
	}
	
	protected void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

}

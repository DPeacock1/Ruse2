package terrain;

import java.awt.Color;

public abstract class TerrainSquare {

	private Color color;
	
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

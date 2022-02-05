package Maps;

import javax.vecmath.Point2d;

import terrain.TerrainSquare;

public abstract class RUSEMap {
	
	protected TerrainSquare[][] terrain = new TerrainSquare[1000][1000];
	protected int resolution = 1;
	
	public RUSEMap() {
		
	}

	public TerrainSquare[][] getTerrain() {
		return terrain;
	}
	
	public TerrainSquare getTerrainSquare(Point2d Cord) {
		Cord.scale(1 / resolution);
		return terrain[(int)Cord.x][(int)Cord.y]; 
	}
}

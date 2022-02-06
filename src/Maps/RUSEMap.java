package Maps;

import javax.vecmath.Point2d;

import terrain.TTerrainSquare;

public abstract class RUSEMap {
	
	protected TTerrainSquare[][] terrain = new TTerrainSquare[1000][1000];
	protected int resolution = 1;
	
	public RUSEMap() {
		
	}

	public TTerrainSquare[][] getTerrain() {
		return terrain;
	}
	
	public TTerrainSquare getTerrainSquare(Point2d Cord) {
		Cord.scale(1 / resolution);
		return terrain[(int)Cord.x][(int)Cord.y]; 
	}
}

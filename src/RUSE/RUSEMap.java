package RUSE;

import terrain.TerrainSquare;

abstract class RUSEMap {
	
	private TerrainSquare[][] terrain = new TerrainSquare[1000][1000];
	
	public RUSEMap() {
		
	}

	public TerrainSquare[][] getTerrain() {
		return terrain;
	}
}

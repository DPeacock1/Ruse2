package Units;

import javax.vecmath.Point2d;

import Maps.RUSEMap;
import Orders.Order;
import terrain.TerrainSquare;

public abstract class Ground extends Unit {

	protected double groundSpeed;
	protected double roadSpeedMultiplier;
	protected boolean canEnterWoods;

	public Ground(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
	
	public double getGroundSpeedMultiplier(RUSEMap map){
		if (map.getTerrainSquare(position)) {
			
		}
	}
}

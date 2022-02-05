package Units;

import javax.vecmath.Point2d;

import Maps.RUSEMap;
import Orders.Order;

public abstract class Ground extends Unit {

	protected double groundSpeed;
	protected double roadSpeedMultiplier;
	protected boolean canEnterWoods;

	public Ground(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
	
	public double getGroundSpeedMultiplier(RUSEMap map){
		TerrainSquare square = map.getTerrainSquare(position)
	}
}

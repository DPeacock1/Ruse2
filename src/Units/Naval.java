package Units;

import javax.vecmath.Point2d;

import Maps.RUSEMap;
import Orders.Order;
import terrain.TGround;
import terrain.TWater;

public abstract class Naval extends Unit {
	
	protected double waterSpeed;
	protected boolean canEnterShallowWater;

	
	public Naval(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
	
	@Override
	public double getTerrainSpeedMultiplier(RUSEMap map) {
		if (map.getTerrainSquare(position) instanceof TWater) {
			return 1;
		} else {
			return 0;
		}
	}
}

package Units;

import javax.vecmath.Point2d;

import Maps.RUSEMap;
import Orders.Order;
import terrain.TGround;
import terrain.TTerrainSquare;

public abstract class Ground extends Unit {

	protected double groundSpeed;
	protected double roadSpeedMultiplier;
	protected boolean canEnterWoods;

	public Ground(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
	@Override
	public double getTerrainSpeedMultiplier(RUSEMap map) {
		if (map.getTerrainSquare(position) instanceof TGround) {
			TGround ground = (TGround) map.getTerrainSquare(position);
			return ground.getGroundSpeedMultiplier();
		} else {
			return 0;
		}
	}
}

package Units;

import javax.vecmath.Point2d;

import RUSE.Order;

public abstract class Ground extends Unit {

	protected double groundSpeed;
	protected double roadSpeedMultiplier;
	protected boolean canEnterWoods;

	public Ground(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
}

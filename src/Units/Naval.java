package Units;

import javax.vecmath.Point2d;

import RUSE.Order;

public abstract class Naval extends Unit {
	
	protected double waterSpeed;
	protected boolean canEnterShallowWater;

	
	public Naval(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}
}

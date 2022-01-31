package Units;

import javax.vecmath.Point2d;

import RUSE.Order;

public abstract class Air extends Unit {

	protected double airSpeed, altitude;
	
	public Air(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}


}

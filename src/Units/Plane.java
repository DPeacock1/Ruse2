package Units;

import javax.vecmath.Point2d;

import RUSE.Order;

public abstract class Plane extends Unit {

	public Plane(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}

}

package Units;

import javax.vecmath.Point2d;

import Orders.Order;

public abstract class Infantry extends Unit {
	
	protected int squadSize;
	
	public Infantry(Point2d position, Order activeOrder) {
		super(position, activeOrder);
	}

}

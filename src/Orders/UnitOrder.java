package Orders;

import javax.vecmath.Point2d;

import Units.Unit;

public class UnitOrder extends Order {

	private Unit unit;
	
	public UnitOrder(Unit unit) {
		this.unit = unit;
	}
	
	@Override
	public Point2d getPosition() {
		return unit.getPosition();
	}

}

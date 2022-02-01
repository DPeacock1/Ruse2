package Orders;

import javax.vecmath.Point2d;

public class PositionOrder extends Order {

	private Point2d position;
	
	public PositionOrder(Point2d position) {
		this.position = position;
	}
	
	@Override
	public Point2d getPosition() {
		return position;
	}
}

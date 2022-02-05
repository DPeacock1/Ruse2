package RUSE;

import javax.vecmath.Point2d;
import javax.vecmath.Tuple2d;
import javax.vecmath.Vector2d;

import Orders.Order;

public abstract class RUSEObject {

	protected Double ACCELERATION;
	protected Rotator MAX_TURN_SPEED;
	protected Point2d position;
	protected Rotator rotation;
	protected Vector2d velocity;
	protected Sprite icon;

	public RUSEObject(Point2d position) {
		this.position = position;
	}

	public void Tick(Double dT) {
		UpdatePosition(dT);
		UpdateRotation(dT);
	}

	public void UpdatePosition(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		Vector2d temp = velocity;
		temp.scale(1 / dT);
		temp.add(position);
		setPosition(temp);
		temp.length();
	}

	public void UpdateRotation(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}

	}

	public Rotator getRotation() {
		return rotation;
	}

	public void setRotation(Rotator rotation) {
		this.rotation = rotation;
	}

	public Rotator getMaxTurnSpeed() {
		return MAX_TURN_SPEED;
	}

	public Sprite getIcon() {
		return icon;
	}

	public void setIcon(Sprite Icon) {
		this.icon = Icon;
	}

	public Point2d getPosition() {
		return position;
	}

	public void setPosition(Tuple2d position) {
		this.position = (Point2d) position;
	}

	public Vector2d getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2d velocity) {
		this.velocity = velocity;
	}

	public void setAngVel(Double speed, Rotator direction) {
		double x = Math.abs(speed) * Math.cos(direction.getRads());
		double y = Math.abs(speed) * Math.sin(direction.getRads());
		this.velocity = new Vector2d(x, y);
		this.rotation = direction;
	}

	public Double getSpeed() {
		return velocity.length();
	}

}

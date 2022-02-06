package RUSE;

import javax.vecmath.Point2d;
import javax.vecmath.Tuple2d;
import javax.vecmath.Vector2d;

import Orders.Order;

public abstract class RUSEObject {

	protected Double ACCELERATION;
	protected Rotator R_ACCELERATION;
	protected Double MAX_R_Velocity;
	protected Point2d position;
	protected Rotator rotation;
	protected Rotator goalRotation;
	protected Vector2d velocity;
	protected Vector2d goalVelocity;
	protected Sprite icon;

	public RUSEObject(Point2d position) {
		this.position = position;
	}

	public void Tick(Double dT) throws IllegalArgumentException {
		UpdatePosition(dT);
		UpdateRotation(dT);
	}

	protected void UpdatePosition(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		Vector2d temp = velocity;
		temp.scale(1 / dT);
		temp.add(position);
		setPosition(temp);
		temp.length();
	}

	protected void UpdateRotation(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		
		
	}
	
	protected void UpdateVelocity(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		
		velocity =  Helper.clamp(goalVelocity, velocity - ACCELERATION, velocity + ACCELERATION);
	}

	public Rotator getRotation() {
		return rotation;
	}

	public void setRotation(Rotator rotation) {
		this.goalRotation = rotation;
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
		this.goalVelocity = velocity;
	}

	public void setAngVel(Double speed, Rotator direction) {
		double x = Math.abs(speed) * Math.cos(direction.getRads());
		double y = Math.abs(speed) * Math.sin(direction.getRads());
		this.goalVelocity = new Vector2d(x, y);
		this.goalRotation = direction;
	}

	public Double getSpeed() {
		return velocity.length();
	}

}

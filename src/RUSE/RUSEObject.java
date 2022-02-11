package RUSE;

import javax.vecmath.Point2d;
import javax.vecmath.Tuple2d;
import javax.vecmath.Vector2d;

import GUI.Sprite;
import Orders.Order;

public abstract class RUSEObject {

	protected Double ACCELERATION_TIME;
	protected Rotator R_ACCELERATION_Time;
	protected Double MAX_R_Velocity;
	protected Point2d position;
	protected Rotator rotation;
	protected Rotator goalRotation;
	protected Vector2d velocity;
	protected Vector2d goalVelocity;
	protected Sprite icon;
	protected Game game;
	protected long velocityUpdateTime;
	protected long rotationUpdateTime;

	public RUSEObject(Game game, Point2d position) {
		this.position = position;
		this.game = game;
	}

	public void tick(Double dT) throws IllegalArgumentException {
		updateVelocity();
		updateRotationSpeed();
		updateRotation(dT);
		updatePosition(dT);
	}

	protected void updatePosition(Double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		Vector2d temp = velocity;
		temp.scale(1 / dT);
		temp.add(position);
		setPosition(temp);
		temp.length();
	}

	protected void updateRotation(double dT) throws IllegalArgumentException {
		if (dT <= 0) {
			throw new IllegalArgumentException("Delta time must be more than 0");
		}
		
		rotation = goalRotation;
		
	}
	
	protected void updateRotationSpeed() throws IllegalArgumentException {
		//double sequence = (game.getTime() - rotationUpdateTime) / R_ACCELERATION_Time;
		//setRotation();
	}

	protected void updateVelocity() {
		double sequence = (game.getTime() - velocityUpdateTime) / ACCELERATION_TIME;

		setSpeed(Helper.lerp(velocity.length(), goalVelocity.length(), sequence));
	}

	public Rotator getRotation() {
		return rotation;
	}

	public void setRotation(Rotator rotation) {
		this.goalRotation = rotation;
		rotationUpdateTime = game.getTime();
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
		velocityUpdateTime = game.getTime();
	}

	public void setAngVel(Double speed, Rotator direction) {
		double x = Math.abs(speed) * Math.cos(direction.getRads());
		double y = Math.abs(speed) * Math.sin(direction.getRads());
		this.goalVelocity = new Vector2d(x, y);
		this.goalRotation = direction;

		velocityUpdateTime = game.getTime();
		rotationUpdateTime = game.getTime();
	}

	public Double getSpeed() {
		return velocity.length();
	}
	
	public void setSpeed(double speed) {
		double x = Math.abs(speed) * Math.cos(rotation.getRads());
		double y = Math.abs(speed) * Math.sin(rotation.getRads());
		this.goalVelocity = new Vector2d(x, y);

		velocityUpdateTime = game.getTime();
	}

	protected Double cubicInterp(Double t) {
		t = Helper.clamp(t, 0.0, 1.0);
		return (-2) * t * t * t + 3 * t * t;
	}
}

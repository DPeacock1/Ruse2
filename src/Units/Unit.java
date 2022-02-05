package Units;

import javax.vecmath.*;

import Orders.Order;
import RUSE.Rotator;
import RUSE.Sprite;
import RUSE.Weapon;

public abstract class Unit {

	protected double MAX_HEALTH;
	protected double health = MAX_HEALTH;
	protected Double ACCELERATION;
	protected Rotator MAX_TURN_SPEED;
	protected Point2d position;
	protected Rotator rotation;
	protected Vector2d velocity;
	protected Weapon[] weapons;
	protected Sprite icon;
	protected int BUILD_COST;
	protected int BUILD_TIME;
	protected boolean hidden;
	protected Order activeOrder;

	public Unit(Point2d position, Order activeOrder) {
		this.position = position;
		this.activeOrder = activeOrder;
	}

	public void Tick(Double dT) {
		UpdatePosition(dT);
		UpdateRotation(dT);
		executeOrder();
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

	public void setOrder(Order order) {
		this.activeOrder = order;
	}

	public Order getOrder() {
		return activeOrder;
	}

	public void executeOrder() {
		// if (activeOrder)
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

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getMaxHealth() {
		return MAX_HEALTH;
	}

	public void setMaxHealth(double maxHealth) {
		this.MAX_HEALTH = maxHealth;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}

	public Sprite getIcon() {
		return icon;
	}

	public void setIcon(Sprite Icon) {
		this.icon = Icon;
	}

	public int getBuildCost() {
		return BUILD_COST;
	}

	public void setBuildCost(int buildCost) {
		this.BUILD_COST = buildCost;
	}

	public int getBuildTime() {
		return BUILD_TIME;
	}

	public void setBuildTime(int buildTime) {
		this.BUILD_TIME = buildTime;
	}

	public boolean getHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
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
		
	}
}

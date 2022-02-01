package Units;

import javax.vecmath.*;

import Orders.Order;
import RUSE.Rotator;
import RUSE.Sprite;
import RUSE.Weapon;

public abstract class Unit {

	protected double maxHealth;
	protected double health = maxHealth;
	protected Weapon[] weapons;
	protected Sprite icon;
	protected int buildCost;
	protected int buildTime;
	protected boolean hidden;
	protected Point2d position;
	protected Order activeOrder;
	protected Rotator rotation, maxTurnSpeed;
	protected Rotator nextFrameRotation;
	protected Vector2d velocity;

	public Unit(Point2d position, Order activeOrder) {
		this.position = position;
		this.activeOrder = activeOrder;
	}

	public void Tick(Double tickLength) {
		UpdatePosition(tickLength);
		UpdateRotation(tickLength);
		executeOrder();
	}

	public void UpdatePosition(Double tickLength) throws IllegalArgumentException {
		if (tickLength <= 0) {
			throw new IllegalArgumentException("Tick length must be more than 0");
		}
		Vector2d temp = velocity;
		temp.scale(1 / tickLength);
		temp.add(position);
		setPosition(temp);
	}
	
	public void UpdateRotation(Double tickLength) throws IllegalArgumentException {
		if (tickLength <= 0) {
			throw new IllegalArgumentException("Tick length must be more than 0");
		}
		
	}

	public void setOrder(Order order) {
		this.activeOrder = order;
	}

	public Order getOrder() {
		return activeOrder;
	}

	public void executeOrder() {
		if (activeOrder)
	}

	public Rotator getRotation() {
		return rotation;
	}

	public void setRotation(Rotator rotation) {
		this.rotation = rotation;
	}

	public Rotator getMaxTurnSpeed() {
		return maxTurnSpeed;
	}

	public Rotator getFrameRotator() {
		return nextFrameRotation;
	}
	
	public void setNextFrameRotation(Rotator nextFrameRotation) {
		this.nextFrameRotation = nextFrameRotation;
	}
	
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(double maxHealth) {
		this.maxHealth = maxHealth;
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
		return buildCost;
	}

	public void setBuildCost(int buildCost) {
		this.buildCost = buildCost;
	}

	public int getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(int buildTime) {
		this.buildTime = buildTime;
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

}

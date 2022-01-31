package Units;

import java.security.InvalidParameterException;

import javax.vecmath.*;

import RUSE.Order;
import RUSE.Rotator;
import RUSE.Sprite;
import RUSE.Weapon;

public abstract class Unit {

	protected double health;
	protected double maxHealth;
	protected Weapon[] weapons;
	protected Sprite icon;
	protected int buildCost;
	protected int buildTime;
	protected boolean hidden;
	protected Point2d position;
	protected Order activeOrder;
	protected Rotator rotation, maxTurnSpeed;
	protected Vector2d velocity;

	public Unit() {
	}

	public void Tick(Double tickLength) {
		UpdatePosition(tickLength);
		UpdateRotation(tickLength);
	}

	public void UpdatePosition(Double tickLength) throws InvalidParameterException {
		if (tickLength <= 0) {
			throw new InvalidParameterException("Tick length must be more than 0");
		}
		Vector2d temp = velocity;
		temp.scale(1 / tickLength);
		temp.add(position);
		setPosition(temp);
	}

	public void setOrder(Order order) {
		this.activeOrder = order;
	}

	public Order getOrder() {
		return activeOrder;
	}

	public void executeOrder() {

	}

	public Rotator getRotation() {
		return rotation;
	}

	public void setRotation(Rotator rotation) {
		this.rotation = rotation;
	}

	public Rotator getMaxTurnSpeed() {
		return this.maxTurnSpeed;
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

package RUSE;

import Units.Unit;
import javax.vecmath.*;

public abstract class Weapon {
	
	protected Unit owner;
	protected Vector2d positionOffset;
	protected Rotator rotationOffset;
	protected Rotator maxRotationOffset;
	
	public Weapon(Unit owner) {
		this.owner = owner;
	}
	
	public Rotator getWorldRotation() {
		return Rotator.add(owner.getRotation(), rotationOffset);
	}
}

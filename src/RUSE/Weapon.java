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
	
	public Rotator getRotationOffset() {
		return rotationOffset;
	}
	
	public void setRotationOffset(Rotator offset) {
		this.rotationOffset = offset;
	}
	
	public void setWorldRotation(Rotator rotation) {
		this.rotationOffset = Rotator.sub(rotation, owner.getRotation());
	}
	
	public Vector2d getPositionOffset() {
		return positionOffset;
	}
	
	public Point2d getWorldPosition() {
		Point2d temp = owner.getPosition();
		temp.add(positionOffset);
		return temp;
	}
	
	public void setPositionOffset(Tuple2d offset) {
		this.positionOffset = (Vector2d) offset;
	}
	
	public void setWorldPosition(Tuple2d position) {
		position.add(positionOffset);
		this.positionOffset = (Vector2d) position;
	}
}

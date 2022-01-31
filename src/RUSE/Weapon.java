package RUSE;

import Units.Unit;
import javax.vecmath.*;

public class Weapon {
	
	private Unit owner;
	private Vector2d positionOffset;
	private Rotator rotationOffset;
	
	public Weapon(Unit owner, Vector2d positionOffset, Rotator rotationOffset) {
		this.owner = owner;
		this.positionOffset = positionOffset;
		this.rotationOffset = rotationOffset;
	}
}

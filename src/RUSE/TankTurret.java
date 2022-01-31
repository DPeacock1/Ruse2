package RUSE;

import javax.vecmath.Vector2d;

import Units.Unit;

public class TankTurret extends Weapon {

	public TankTurret(Unit owner) {
		super(owner);
		positionOffset = new Vector2d(0,0);
		rotationOffset = new Rotator(0.0, false);
	}

}

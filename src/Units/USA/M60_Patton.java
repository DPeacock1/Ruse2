package Units.USA;

import javax.vecmath.Point2d;
import javax.vecmath.Vector2d;

import Factions.Faction;
import Orders.Order;
import RUSE.Game;
import RUSE.Rotator;
import RUSE.Sprite;
import RUSE.TankTurret;
import RUSE.Weapon;
import Units.Ground;

public class M60_Patton extends Ground {
	

	public M60_Patton(Game game, Point2d position, Faction faction, Order activeOrder) {
		super(game,position, faction, activeOrder);
		icon = new Sprite();
		
		MAX_HEALTH = 100;
		weapons = new Weapon[]{new TankTurret(this)};
		BUILD_COST = 10;
		BUILD_TIME = 0;
		hidden = false;
		MAX_TURN_SPEED = new Rotator(10.0, false);
		groundSpeed = 10;
		roadSpeedMultiplier = 2;
		canEnterWoods = true;
	}

}

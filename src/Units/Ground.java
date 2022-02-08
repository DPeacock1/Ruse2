package Units;

import javax.vecmath.Point2d;

import Factions.Faction;
import Maps.RUSEMap;
import Orders.Order;
import RUSE.Game;
import terrain.TGround;

public abstract class Ground extends Unit {

	protected double groundSpeed;
	protected double roadSpeedMultiplier;
	protected boolean canEnterWoods;

	public Ground(Game game, Point2d position, Faction faction, Order activeOrder) {
		super(game,position, faction, activeOrder);
	}
	
	@Override
	public double getTerrainSpeedMultiplier(RUSEMap map) {
		if (map.getTerrainSquare(position) instanceof TGround) {
			TGround ground = (TGround) map.getTerrainSquare(position);
			return ground.getGroundSpeedMultiplier();
		} else {
			return 0;
		}
	}
}

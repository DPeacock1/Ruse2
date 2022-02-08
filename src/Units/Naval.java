package Units;

import javax.vecmath.Point2d;

import Factions.Faction;
import Maps.RUSEMap;
import Orders.Order;
import RUSE.Game;
import terrain.TGround;
import terrain.TWater;

public abstract class Naval extends Unit {
	
	protected double waterSpeed;
	protected boolean canEnterShallowWater;

	
	public Naval(Game game, Point2d position, Faction faction, Order activeOrder) {
		super(game,position, faction, activeOrder);
	}
	
	@Override
	public double getTerrainSpeedMultiplier(RUSEMap map) {
		if (map.getTerrainSquare(position) instanceof TWater) {
			return 1;
		} else {
			return 0;
		}
	}
}

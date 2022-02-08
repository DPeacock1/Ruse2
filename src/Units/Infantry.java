package Units;

import javax.vecmath.Point2d;

import Factions.Faction;
import Orders.Order;
import RUSE.Game;

public abstract class Infantry extends Unit {
	
	protected int squadSize;
	
	public Infantry(Game game, Point2d position, Faction faction, Order activeOrder) {
		super(game,position, faction, activeOrder);
	}

}

package Units;

import javax.vecmath.Point2d;

import Factions.Faction;
import Orders.Order;
import RUSE.Game;

public class Helicopter extends Unit {

	public Helicopter(Game game, Point2d position, Faction faction, Order activeOrder) {
		super(game,position, faction, activeOrder);
	}

}

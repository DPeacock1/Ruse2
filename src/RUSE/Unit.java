package RUSE;

abstract class Unit {

	private double health;
	private double maxHealth;
	private Weapon[] weapons;
	private Sprite icon;
	private int buildCost;
	private int buildTime;
	private boolean hidden;

	public Unit() {

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
		this.buildCost
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
}

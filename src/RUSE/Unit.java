package RUSE;

abstract class Unit {

	protected double health;
	protected double maxHealth;
	protected Weapon[] weapons;
	protected Sprite icon;
	protected int buildCost;
	protected int buildTime;
	protected boolean hidden;
	protected double posx, posy;
	protected double velx, vely;
	
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
		this.buildCost = buildCost;
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
	
	public double getPosx() {
		return posx;
	}
	
	public void setPosx(double posx) {
		this.posx = posx;
	}
	
	public double getPosy() {
		return posy;
	}
	
	public void setPosy(double posy) {
		this.posy = posy;
	}
	
	public double getVelx() {
		return velx;		
	}
	
	public void setVelx(double velx) {
		this.velx = velx;
	}
	
	public double getVely() {
		return vely;
	}
	
	public void setVely(double vely) {
		this.vely = vely;
	}
}

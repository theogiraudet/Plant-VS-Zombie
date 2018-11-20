package plantvszombie.entity;

public class Plant extends Mob {

	private int coolDown;
	private int cost;
	
	public Plant(int x, int y, int hP, int cost, int coolDown) {
		this(x, y, hP, cost, coolDown, 0, 0);
	}
	
	public Plant(int x, int y, int hP, int cost, int coolDown, int damage, int attackSpeed) {
		super(x, y, hP, damage, attackSpeed, 0);
		this.coolDown = coolDown;
		this.cost = cost;
	}

	@Override
	public void step() {
	}

	@Override
	public void dessine() {
	}

	public int getCoolDown() {
		return coolDown;
	}

	public int getCost() {
		return cost;
	}
}

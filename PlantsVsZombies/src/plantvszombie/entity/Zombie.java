package plantvszombie.entity;

public class Zombie extends Mob {
	
	public Zombie(int y, int attackSpeed, int hP, int speed, int damage) {
		this(13, y, attackSpeed, hP, speed, damage);
	}

	public Zombie(int x, int y, int attackSpeed, int hP, int speed, int damage) {
		super(x, y, hP, damage, attackSpeed, speed);
	}

	@Override
	public void step() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dessine() {
		// TODO Auto-generated method stub

	}
}

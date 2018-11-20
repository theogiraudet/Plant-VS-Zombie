package plantvszombie.entity;

public abstract class Mob extends Entite {

	private int hP, damage, attackSpeed;

	public Mob(double x, double y, int hP, int damage, int attackSpeed, int speed) {
		super(x, y, speed);
		this.hP = hP;
		this.damage = damage;
		this.setAttackSpeed(attackSpeed);
	}
	
	public Mob(double x, double y, int hP, int damage, int attackSpeed) {
		this(x, y, hP, damage, attackSpeed, 0);
	}
	
	public Mob(double x, double y, int hP) {
		this(x, y, hP, 0, 0);
	}
	


	public int gethP() {
		return hP;
	}

	public void sethP(int hP) {
		this.hP = hP;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	
}

package plantvszombie.entity;

public class Projectile extends Entite {

	private int damage;
	
	public Projectile(double x, double y, int speed, int damage) {
		super(x, y, speed);
		this.setDamage(damage); 
	}

	@Override
	public void step() {
		
	}

	@Override
	public void dessine() {
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

}

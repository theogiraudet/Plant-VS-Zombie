package plantvszombie.entity;

import plantvszombie.StdDraw;
import plantvszombie.Timer;

public class TrucQuiBouge extends Entite {

	private static final double TRUC_MOVE_X = 0.0025;
	@SuppressWarnings("unused")
	private static final double TRUC_SIZE = 0.05;
	private boolean statut;
	private Timer timer;
	
	public TrucQuiBouge(double x, double y) {
		super(x, y, 0);
		this.statut=true;
		timer = new Timer(2500); // timer de 2.5 secondes
	}
	
	@Override
	public void step() {
		this.position.setX(this.position.getX() + TRUC_MOVE_X);
		if (this.position.getX() > 1.0) this.position.setX(0.0); 
		// TODO ici l'objet repart à l'autre bout de l'ecran, a ne pas faire dans votre code
		
		if (timer.hasFinished()) {
			this.statut = !this.statut; // on change le statut
			timer.restart(); // on redemarre le timer
		}
	}

	@Override
	public void dessine() {
		if (statut)
			StdDraw.setPenColor(StdDraw.RED);
		else
			StdDraw.setPenColor(StdDraw.BLUE);
		//StdDraw.filledSquare(this.position.getX(), this.position.getY(), TRUC_SIZE);
	}

}

package plantvszombie;
import java.util.LinkedList;
import java.util.List;

import plantvszombie.entity.Entite;
import plantvszombie.entity.Plant;
import plantvszombie.entity.TrucQuiBouge;

public class GameWorld {


	// l'ensemble des entites, pour gerer (notamment) l'affichage
	private static List<Entite> entites;
	
	@SuppressWarnings("unused")
	private Plant[][] grid = new Plant[5][9];

	
	//Pour savoir si la partie est gagnee ou pas
	private static boolean gameWon;
	// Idem pour savoir si le jeu est perdu (si le jeu n'est ni gagne ni perdu, il est en cours)
	private static boolean gameLost;

	// constructeur, il faut initialiser notre monde virtuel
	public GameWorld() {

		gameWon=false;
		gameLost=false;
		
		// on cree les collections
		entites = new LinkedList<Entite>();

		// on rajoute une entite de demonstration
		entites.add(new TrucQuiBouge(0, 0.5));
		
	}

	/**
	 * Gestion des interactions clavier avec l'utilisateur
	 * 
	 * @param key
	 *            Touche pressee par l'utilisateur
	 */
	public void processUserInput(char key) {
		switch (key) {
		case 't':
			System.out.println("Le joueur veut planter un Tournesol...");
			// TODO
			break;
		case 'p':
			System.out.println("Le joueur veut planter un Tire-Pois...");
			// TODO
			break;
		case 'n':
			System.out.println("Le joueur veut planter une Noix...");
			// TODO
			break;

		default:
			System.out.println("Touche non prise en charge");
			break;
		}
	}
	
	/**
	 * Gestion des interactions souris avec l'utilisateur (la souris a été cliquée)
	 * 
	 * @param x position en x de la souris au moment du clic
	 * @param y position en y de la souris au moment du clic
	 */
	public void processMouseClick(double x, double y) {
		System.out.println("La souris a été cliquée en : "+x+" - "+y);
		int xC = -1;
		int yC = -1;
		for(int i = 1; i <= 9; i++)
			if(x >= (2.0 / 25 * i - 0.02) && x < (2.0 / 25 * (i + 1) - 0.02))
				xC = i - 1;
		for(int i = 1; i <= 5; i++)
			if(y >= (1.0 / 6 * i + (0.04 - 1.0 / 6)) && y < (1.0 / 6 * (i + 1) + (0.04 - 1.0 / 6)))
				yC = 6 - i - 1;
		if(xC >= 0 && yC>= 0)
			System.out.println("Clic sur la case " + xC + ", " + yC);
	}

	// on fait bouger/agir toutes les entites
	public void step() {
		for (Entite entite : GameWorld.entites)
			entite.step();
	}

	// dessine les entites du jeu
	public void dessine() {

		StdDraw.picture(0.5, 0.5, getClass().getResource("/Field.JPG").toString());
		double offset = -0.02;
		for(int i = 1; i <= 13; i++)
			StdDraw.line(2.0 / 25 * i + offset, 0, 2.0 / 25 * i + offset, 1);
		offset = 0.04 - 1.0 / 6;
		for(int j = 1; j <= 6; j++)
			StdDraw.line(0, 1.0 / 6 * j + offset, 1, 1.0 / 6 * j + offset);
		
		// affiche les entites
		for (Entite entite : entites)
			entite.dessine();
	}

	public static boolean gameWon() {
		return gameWon;
	}
	
	public static boolean gameLost() {
		return gameLost;
	}


}

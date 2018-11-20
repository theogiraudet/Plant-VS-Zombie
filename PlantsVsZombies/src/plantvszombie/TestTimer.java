package plantvszombie;

public class TestTimer {

	public static void main(String[] args) {

		Timer t = new Timer(2000); // demarre un timer de 2 secondes (2000 millisecondes)
		System.out.println(t.hasFinished()); // a t'il fini ? (non, temps trop court)
		try {
			Thread.sleep(3000); // attendre 3 secondes
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.hasFinished()); // verifier que le timer a bien fini
		
	}

}

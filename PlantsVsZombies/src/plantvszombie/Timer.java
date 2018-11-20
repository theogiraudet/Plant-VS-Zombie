package plantvszombie;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Timer {

	private Instant debut;
	private long duree; // duree du timer en millisecondes
	
	public Timer(long duree) {
		this.duree = duree;
		restart();
	}
	
	public void restart() {
		debut = Instant.now();
	}
	
	public boolean hasFinished() {
		return (debut.compareTo((Instant.now().minus(duree, ChronoUnit.MILLIS))) < 0);
	}
	
}

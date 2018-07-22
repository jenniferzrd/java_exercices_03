package exercice.elections.test;
import exercice.elections.ElectionsException;
import exercice.elections.ListeElectorale;

public class MainTest1ListeElectorale {

	public static void main(String[] args) {
		
		ListeElectorale listeElectorale1 = new ListeElectorale (1, "A", 3200, 0, false);
		System.out.println("listeElectorale1=" + listeElectorale1);

		listeElectorale1.setSeat(2);
		System.out.println("listeElectorale1=" + listeElectorale1);
		
		ListeElectorale listeElectorale2 = listeElectorale1;
		System.out.println("listeElectorale2=" + listeElectorale2);
		
		listeElectorale2.setSeat(3);
		System.out.println("listeElectorale1=" + listeElectorale1);
		System.out.println("listeElectorale2=" + listeElectorale2);
		
		try {
			listeElectorale2.setSeat(-3);
			} catch (ElectionsException ex) {
			System.err.println("L'exception suivante s'est produite : ["
			+ ex.toString() + "]");
		}
	}

}

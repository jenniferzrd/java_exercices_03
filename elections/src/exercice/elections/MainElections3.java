package exercice.elections;

import java.util.ArrayList;
import java.util.Scanner;

public class MainElections3 {

	public static void main(String[] arguments) {
		int id = 1;
		int siegeAPouvoir = 0;
		int totalVoix = 0;
		String nomDeLaListe = "";
		int voix = 0;
		int TotalDesVoix = 0;
		int quotientElectoral;
		double pourcentage = 0.05;

		ArrayList<ListeElectorale> listeElectorale = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de siège à pourvoir");
		siegeAPouvoir = sc.nextInt();
		sc.nextLine();

		while (!"*".equals(nomDeLaListe)) {

			System.out.println("Veuillez saisir le nom de la liste:");
			nomDeLaListe = sc.nextLine();

			if (!"*".equals(nomDeLaListe)) {
				System.out.println("Veuillez saisir le nombre de voix pour [" + nomDeLaListe + "] :");
				voix = sc.nextInt();
				sc.nextLine();

				ListeElectorale liste = new ListeElectorale(id, nomDeLaListe, voix, 0, false);
				listeElectorale.add(liste);
				id ++;
			}
		}
		

		for (ListeElectorale listeElect : listeElectorale) {
			TotalDesVoix += listeElect.getVote();
		}
		
		
		for (ListeElectorale liste : listeElectorale) {
			if (liste.getVote() < (pourcentage * TotalDesVoix)) {
				liste.setKo(true);
			}
			if (!liste.isKo()) {
				totalVoix += liste.getVote();
			}
		}
		
		
		quotientElectoral = totalVoix / siegeAPouvoir;
		for (ListeElectorale liste : listeElectorale) {
			if (!liste.isKo()) {
				int sieges = liste.getVote() / quotientElectoral;
				liste.setSeat(sieges);
			}
		}
		System.out.println(TotalDesVoix);
		System.out.println(totalVoix);
		System.out.println(listeElectorale);
	}
}

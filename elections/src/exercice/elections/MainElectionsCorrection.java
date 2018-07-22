package exercice.elections;

import java.util.*;

public class MainElectionsCorrection {

	public static double pourcentage = 0.05;
	public static String nomDeLaListe = "";
	public static int vote = 0;
	public static int id = 1;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de siège à pourvoir");
		int nbSieges = scan.nextInt();
		while (nbSieges < 1) {
			System.out.println("\nError ! Enter a positive number of seats");
			nbSieges = scan.nextInt();
		}

		ArrayList<ListeElectorale> listeElectorale = new ArrayList<>();

		while (!nomDeLaListe.equals("*")) {
			System.out.println("Veuillez saisir le nom de la liste: ");
			nomDeLaListe = scan.next();
			if (nomDeLaListe.equals("*")) {
				System.out.println("==================================");
				break;
			}
			System.out.println("Veuillez saisir le nombre de voix pour " + nomDeLaListe);
			vote = scan.nextInt();

			ListeElectorale liste = new ListeElectorale(id, nomDeLaListe, vote, nbSieges, false);

			listeElectorale.add(liste);
			id++;
		}

		scan.close();

		int totalVotes = 0;
		for (ListeElectorale liste : listeElectorale) {
			totalVotes += liste.getVote();
		}

		int totalVotesUtiles = 0;
		for (ListeElectorale liste : listeElectorale) {
			if (liste.getVote() < (pourcentage * totalVotes)) {
				liste.setKo(true);
			}
			if (!liste.isKo()) {
				totalVotesUtiles += liste.getVote();
			}
		}

		int quotientElectoral = totalVotesUtiles / nbSieges;
		for (ListeElectorale liste : listeElectorale) {
			if (!liste.isKo()) {
				int sieges = liste.getVote() / quotientElectoral;
				liste.setSeat(sieges);
			}
		}

		int siegeUtile = 0;
		for (ListeElectorale liste : listeElectorale) {
			siegeUtile += liste.getSeat();
		}

		int remainingSeats = nbSieges - siegeUtile;

		if (remainingSeats > 0) {

			// Create copy of roll to do the math without changing original roll
			ArrayList<ListeElectorale> simulationListeElectorale = new ArrayList<>();
			for (ListeElectorale liste : listeElectorale) {
				ListeElectorale copieListe = new ListeElectorale(liste.getId(), liste.getName(), liste.getVote(),
						liste.getSeat(), liste.isKo());
				simulationListeElectorale.add(copieListe);
			}

			for (ListeElectorale simuListe : simulationListeElectorale) {
				int listeVotes = simuListe.getVote();
				int listeSeat = simuListe.getSeat();
				int newVotes = listeVotes / (listeSeat + 1);
				simuListe.setVote(newVotes);
			}


			for (int i = 0; i < remainingSeats; i++) {
				simulationListeElectorale.get(i).setSeat(simulationListeElectorale.get(i).getSeat() + 1);
			}

			for (ListeElectorale simuListe : simulationListeElectorale) {
				int id2 = simuListe.getId();
				for (ListeElectorale liste : listeElectorale) {
					if (liste.getId() == id) {
						liste.setSeat(simuListe.getSeat());
					}
				}
			}


		        System.out.println("THE RESULTS ARE IN :");
		        System.out.println("==================================");
		        for (ListeElectorale liste:listeElectorale) {
		            System.out.println("List [" + liste.getName() + "] got [" + liste.getSeat() + "] seats with [" + liste.getVote() + "] votes.");
		        }

		}

	}
}

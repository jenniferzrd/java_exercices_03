package exercice.elections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// PREMIER ESSAI

public class MainElections {

	public static void main(String[] arguments) {

		List<ListeElectorale> listTable = new ArrayList<ListeElectorale>();
		ListeElectorale liste = new ListeElectorale();

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir le nombre de siège à pourvoir :");
		int seat = sc.nextInt();
		sc.nextLine();
		String name = "";

		int sumElectoralList = 0; 
		// Total des voix de toutes les listes
		int quotient = 0;
		int result;
		int somme = 1;
		
		try {
			while (!"*".equals(name)) {

				liste = new ListeElectorale();

				System.out.println("Veuillez saisir le nom de la liste:");
				name = sc.nextLine();

				// LAID
				// if ("*".equals(name)) {
				// System.out.println("Fin de la liste.");
				// break;
				// }

				// GOOD
				if (!"*".equals(name)) {

					liste.setName(name);

					System.out.println("Veuillez saisir le nombre de voix pour [" + name + "] :");
					int vote = sc.nextInt();
					sc.nextLine();

					liste.setVote(vote);
					listTable.add(liste);
				}

				for (int i = 0; i < listTable.size(); i++) {

					// Ceux qui ont obtenu - de 5% sont éliminés, le pourcentage dépend du nombre de
					// liste

					int numbSuffrageExprimé = 100000;
					int eachVotes = listTable.get(i).getVote();
					int prct = 100 * eachVotes / numbSuffrageExprimé;
					float limitMin = (float) 5 / 100 * 100;

					if (prct < limitMin) {
						liste.setKo(false);
						liste.setSeat(0);
					} else {
						liste.setKo(true);
					}
				}

				for (int i = 0; i < listTable.size(); i++) {
					
					int eachVotes = listTable.get(i).getVote();
					
					sumElectoralList = sumElectoralList + eachVotes;
					// Je calcule le total des votes de mes listes
					
					System.out.println(sumElectoralList);

					quotient = sumElectoralList / seat;
					// Je calcule mon quotient en divisant mon total avec mes sièges : dans
					// l'exemple 93000 / 6 (le nombre de siège) = quotient)

					// 32000 (eachVotes) / 15000 = nombre de siege a donner soit 2

					if (eachVotes > quotient) {
						result = eachVotes / quotient;
						liste.setSeat(result);
						System.out.println("quotient: " + quotient + " eachVotes: " + eachVotes);
						System.out.println(result);
					}
				}

				for (int i = 0; i < listTable.size(); i++) {
					result = listTable.get(i).getSeat();
					somme = result + somme;
					liste.setSeat(somme);
				}
			}

			System.out.println(listTable);

		} catch (ElectionsException ex) {
			System.err.println("L'exception suivante s'est produite : [" + ex.toString() + "]");
		}
	}
}

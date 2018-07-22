package exercice.elections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainElections2 {

	public static void main(String[] arguments) {

		int siegeAPouvoir = 0;
		int suffrage = 0;
		String nomDeLaListe = "";
		int voix = 0;
		int TotalDesVoix = 0;
		int quotientElectoral;

		List<ListeElectorale> arrayListe = new ArrayList<ListeElectorale>();
		ListeElectorale liste = new ListeElectorale();

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de siège à pourvoir");
		siegeAPouvoir = sc.nextInt();
		sc.nextLine();

		try {

			while (!"*".equals(nomDeLaListe)) {

				liste = new ListeElectorale();

				System.out.println("Veuillez saisir le nom de la liste:");
				// je récupère la saisie du nom de la liste : A, B, C ...
				nomDeLaListe = sc.nextLine();

				if (!"*".equals(nomDeLaListe)) {

					// pour que la boucle s'arrête au "*" j'ajoute ma condition

					liste.setName(nomDeLaListe);
					// je récupère le nom de la liste

					System.out.println("Veuillez saisir le nombre de voix pour [" + nomDeLaListe + "] :");

					voix = sc.nextInt();
					// on récupère la saisie du nombre de voix
					sc.nextLine();
					liste.setVote(voix);
					// je récupère les voix de la liste précédente

					arrayListe.add(liste);
					// j'ajoute dans mon tableau mon objet "liste"
				}
			}

			// J'elimine ceux qui font moins de 5%

			for (int i = 0; i < arrayListe.size(); i++) {

				int ToutesLesVoixDuneListe = arrayListe.get(i).getVote();
				TotalDesVoix += ToutesLesVoixDuneListe;

				// System.out.println(
				// "Mon nombre de voix : " + ToutesLesVoixDuneListe + " Mon Total de mes voix: "
				// + TotalDesVoix);
			}

			int elemine = (5 * 10) / 10;
//			System.out.println("5% : " + elemine);
			
			for (int i = 0; i < arrayListe.size(); i++) {


				// je multiplie par 100 toutes les voix qui correspondent à une liste puis je
				// divise par le total de toutes les voix de toutes les listes
				// ex : je prend la liste A qui fait 32 000 voix : 32 000 x 100
				// je divise par le total des voix de toutes les listes : 32 000 + 25 000 + 16 000 ...
				
				int ToutesLesVoixDuneListe = arrayListe.get(i).getVote();
				int prct = (100 * ToutesLesVoixDuneListe) / TotalDesVoix;
				
				if (prct < elemine) {

					arrayListe.get(i).setKo(false);
					arrayListe.get(i).setVote(0);
//					System.out.println("faux");

				} else {
					arrayListe.get(i).setKo(true);
//					System.out.println("vrai");
				}
				
//				if(arrayListe.get(i).isKo()) {
//					
//					
					// s'il fait moins de 5% on elimine donc 100 000 - ceux éléminé, donc TotalDesVoix - ceux éléminé
					
//					quotientElectoral = TotalDesVoix / siegeAPouvoir;
//					System.out.println("quotientElectoral : " + quotientElectoral);
//					
//					// On attribue les sièges en fonction du nombre de fois où le quotient correspond aux voix d'une liste
//					// soit combien de fois vaut le quotient dans ToutesLesVoixDuneListe ?
//					
//					int siegeAAttribuer = ToutesLesVoixDuneListe / quotientElectoral;
//					System.out.println("siegeAAttribuer : " + siegeAAttribuer);
					
//					ToutesLesVoixDuneListe = arrayListe.get(i).getVote();
//					TotalDesVoix += ToutesLesVoixDuneListe;	
					
					System.out.println(arrayListe);
					
//				}

				System.out.println("pourcentage : " + prct);
				System.out.println("total des voix : " + TotalDesVoix);

			}

			System.out.println(arrayListe);

		} catch (ElectionsException ex) {
			System.err.println("L'exception suivante s'est produite : [" + ex.toString() + "]");
		}

	}
}

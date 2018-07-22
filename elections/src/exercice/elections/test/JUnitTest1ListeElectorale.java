package exercice.elections.test;


import org.junit.Assert;
import org.junit.Test;

import exercice.elections.ElectionsException;
import exercice.elections.ListeElectorale;

public class JUnitTest1ListeElectorale {

	@Test
	public void t1() {
		
		ListeElectorale liste = new ListeElectorale(1, "a", 32000, 0, false);
		
		Assert.assertEquals("a", liste.getName());
		Assert.assertEquals(32000, liste.getVote());
		Assert.assertEquals(false, liste.isKo());
		Assert.assertEquals(0, liste.getSeat());
		
		
		boolean erreur = false;
		try {
			liste.setId(-4);
		} catch (ElectionsException e) {
			erreur = true;
		}
		Assert.assertEquals(true, erreur);

		erreur = false;
		try {
			liste.setName("");
		} catch (ElectionsException e) {
			erreur = true;
		}
		Assert.assertEquals(true, erreur);
		
		erreur = false;
		try {
			liste.setVote(-4);
		} catch (ElectionsException e) {
			erreur = true;
		}
		Assert.assertEquals(true, erreur);
		
		erreur = false;
		try {
			liste.setSeat(-4);
		} catch (ElectionsException e) {
			erreur = true;
		}
		Assert.assertEquals(true, erreur);
	}

}

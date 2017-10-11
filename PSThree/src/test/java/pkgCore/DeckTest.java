package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgException.DeckException;

public class DeckTest {

	@Test (expected= DeckException.class)
	public void TestEmptyDeck() throws DeckException {
		Deck d = new Deck();
			for(int i=0;i<60;i++)
			{
				d.Draw();
			}

	}
	
	@Test
	public void TestDrawSuit() {
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eSuit.HEARTS);
		assertTrue(card.geteSuit() == pkgEnum.eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eRank.FIVE);
		assertTrue(card.geteRank() == pkgEnum.eRank.FIVE);
	}
	@Test
	public void TestDeckRankCount() {
		Deck d = new Deck();
		assertEquals(d.DeckRankCount(pkgEnum.eRank.EIGHT), 4);
	}
	
	public void TestDeckSuitCount() {
		Deck d = new Deck();
		assertEquals(d.DeckSuitCount(pkgEnum.eSuit.DIAMONDS), 14);
	}

}

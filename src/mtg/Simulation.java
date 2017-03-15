package mtg;

import mtg.deck.Deck;
import mtg.game.Library;
import mtg.game.Player;
import mtg.game.Shuffling;
import mtg.utils.Lists;

public class Simulation {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		Player me = new Player("Ed");
		
		Library lib = Shuffling.shuffleDeck(deck);
		
		me.setLibrary(lib);
		me.drawHand();
		me.mulligan();
	}

}

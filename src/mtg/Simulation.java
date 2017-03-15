package mtg;

import mtg.deck.Deck;
import mtg.game.Library;
import mtg.game.Shuffling;
import mtg.utils.Lists;
import mtg.utils.Utils;

public class Simulation {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		
		Library lib = Shuffling.pileShuffleDeck(deck, 6);
		
		Utils.listCards(lib);
	}

}

package mtg;

import java.util.LinkedList;

import mtg.deck.Deck;
import mtg.game.Library;
import mtg.game.Shuffling;
import mtg.utils.Lists;
import mtg.utils.Utils;

public class Simulation {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		
		Library lib = Shuffling.pileShuffleDeck(deck, 2);
		
		Utils.listCards(lib);
		
		new LinkedList<>().iterator();
	}

}

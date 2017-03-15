package mtg;

import java.util.List;

import mtg.deck.Card;
import mtg.deck.Deck;
import mtg.game.Shuffling;
import mtg.utils.Lists;
import mtg.utils.Utils;

public class Simulation {

	public static void main(String[] args) {
		firstHand();
	}

	private static void firstHand() {
		Deck deck = Lists.affinity();
		
		Shuffling.shuffleCards(deck);
		
		List<Card> hand = Shuffling.draw7(deck);
		
		String hash = Utils.hash(hand);
		System.out.println(hash);
		Utils.listCards(hand);
	}
	
}

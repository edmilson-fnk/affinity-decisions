package mtg;

import java.util.List;

import mtg.deck.Card;
import mtg.deck.Deck;
import mtg.deck.Lists;
import mtg.jogo.Shuffling;
import mtg.utils.Utils;

public class Match {

	public static void main(String[] args) {
		firstHand();
	}

	private static void firstHand() {
		Deck deck = Lists.affinity();
		
		Shuffling.shuffleCards(deck);
		
		List<Card> hand = deck.draw7();
		
		String hash = Utils.hash(hand);
		System.out.println(hash);
		Utils.listCards(hand);
	}
	
}

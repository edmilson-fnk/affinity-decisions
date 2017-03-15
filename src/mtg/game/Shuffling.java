package mtg.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import mtg.deck.Card;
import mtg.deck.Deck;

public class Shuffling {

	public static Library shuffleDeck(Deck deck) {
		Collections.shuffle(deck.getDeckList(), new Random());
		
		return new Library(deck);
	}
	
	public static Library pileShuffleDeck(Deck deck, int num) {
		List<List<Card>> piles = new ArrayList<List<Card>>();
		for (int i = 0; i < num; i++) {
			piles.add(new ArrayList<Card>());
		}
		
		int n = 0;
		for (Card card : deck.getDeckList()) {
			if (n == num) n = 0;
			
			piles.get(n).add(card);
			n++;
		}
		
		deck.getDeckList().clear();
		for (List<Card> pile : piles) {
			deck.getDeckList().addAll(pile);
		}
		
		return new Library(deck);
	}

}

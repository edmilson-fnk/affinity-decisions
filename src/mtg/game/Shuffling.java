package mtg.game;

import java.util.Collections;
import java.util.Random;

import mtg.deck.Deck;

public class Shuffling {

	public static Library shuffleDeck(Deck deck) {
		Collections.shuffle(deck.getDeckList(), new Random());
		
		Library library = new Library(deck);
		
		return library;
	}
	
	public static void pileShuffleDeck(Deck deck) {
		
	}

}

package mtg.game;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import mtg.deck.Card;
import mtg.deck.Deck;

public class Shuffling {

	public static void reshuffleHand(Deck deck, List<Card> mao) {
		deck.getDeckList().addAll(mao);
		shuffleCards(deck);
	}
	
	public static void shuffleCards(Deck deck) {
		Collections.shuffle(deck.getDeckList(), new Random());
		Collections.shuffle(deck.getDeckList(), new Random());
	}
	
	public static void pileShuffle(Deck deck) {
		
	}

	public static List<Card> draw7(Deck deck) {
		return Shuffling.draw(deck, 7);
	}

	public static List<Card> draw(Deck deck, int qtd) {
		List<Card> mao = new LinkedList<Card>();
		
		for (int i = 0; i < qtd; i++) {
			mao.add(deck.getDeckList().remove(0));
		}
		
		return mao;
	}
	
}

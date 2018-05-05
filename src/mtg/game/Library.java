package mtg.game;

import java.util.LinkedList;

import mtg.deck.Card;
import mtg.deck.Deck;

public class Library extends LinkedList<Card> {

	private static final long serialVersionUID = 5700078727425937710L;

	private Deck deck;
	
	public Library(Deck deck) {
		this.setDeck(deck);
		this.addAll(deck.getDeckList());
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Hand draw7() {
		return this.draw(7);
	}

	public Hand draw(int qtd) {
		Hand hand = new Hand();
		
		for (int i = 0; i < qtd; i++) {
			hand.add(this.remove(0));
		}
		
		return hand;
	}
	
}

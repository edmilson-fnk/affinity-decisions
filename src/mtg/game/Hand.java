package mtg.game;

import java.util.LinkedList;

import mtg.deck.Card;
import mtg.utils.Utils;

public class Hand extends LinkedList<Card> {

	private static final long serialVersionUID = 2601206597756792531L;
	
	public String getHash() {
		return Utils.hash(this);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}

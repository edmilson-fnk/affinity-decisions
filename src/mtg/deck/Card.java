package mtg.deck;

import mtg.deck.enums.CardName;
import mtg.deck.enums.CardClassification;

public class Card {

	private CardName name;
	private CardClassification type;
	
	public Card(CardName name, CardClassification type) {
		this.name = name;
		this.type = type;
	}
	
	public CardName getName() {
		return name;
	}
	
	public void setName(CardName name) {
		this.name = name;
	}
	
	public CardClassification getClassification() {
		return type;
	}
	
	public void setClassification(CardClassification type) {
		this.type = type;
	}
	
}

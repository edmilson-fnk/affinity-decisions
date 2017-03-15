package mtg.deck;

import java.util.LinkedList;
import java.util.List;

public class Deck {

	private String name;
	private List<Card> deckList;
	private List<Card> sideboard;
	
	public Deck() {
		this.deckList = new LinkedList<Card>();
		this.sideboard = new LinkedList<Card>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Card> getDeckList() {
		return deckList;
	}
	
	public void setDeckList(List<Card> lista) {
		this.deckList = lista;
	}
	
	public List<Card> getSideboard() {
		return sideboard;
	}
	
	public void setSideboard(List<Card> sideboard) {
		this.sideboard = sideboard;
	}

}

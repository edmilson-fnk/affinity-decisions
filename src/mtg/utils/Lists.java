package mtg.utils;

import java.util.List;

import mtg.deck.Card;
import mtg.deck.Deck;
import mtg.deck.enums.CardClassification;
import mtg.deck.enums.CardName;

public class Lists {

	public static Deck affinity() {
		Deck deck = new Deck();
		
		deck.setName("Affinity");
		
		List<Card> deckList = deck.getDeckList();
		
		deckList.addAll(Utils.createCard(CardName.DARKSTEEL_CITADEL, CardClassification.LAND, 4));
		deckList.addAll(Utils.createCard(CardName.BLINKMOTH_NEXUS, CardClassification.LAND, 4));
		deckList.addAll(Utils.createCard(CardName.INKMOTH_NEXUS, CardClassification.LAND, 4));
		deckList.addAll(Utils.createCard(CardName.GLIMMERVOID, CardClassification.LAND, 3));
		deckList.addAll(Utils.createCard(CardName.ISLAND, CardClassification.LAND, 1));
		deckList.addAll(Utils.createCard(CardName.MOUNTAIN, CardClassification.LAND, 1));
		deckList.addAll(Utils.createCard(CardName.ARCBOUND_RAVAGER, CardClassification.BOMB_2, 4));
		deckList.addAll(Utils.createCard(CardName.STEEL_OVERSEER, CardClassification.BOMB_2, 4));
		deckList.addAll(Utils.createCard(CardName.CRANIAL_PLATING, CardClassification.BOMB_2, 4));
		deckList.addAll(Utils.createCard(CardName.ETCHED_CHAMPION, CardClassification.BOMB_3, 2));
		deckList.addAll(Utils.createCard(CardName.MASTER_ETHERIUM, CardClassification.BOMB_3, 2));
		deckList.addAll(Utils.createCard(CardName.MEMNITE, CardClassification.COST_0, 3));
		deckList.addAll(Utils.createCard(CardName.ORNITHOPTER, CardClassification.COST_0, 4));
		deckList.addAll(Utils.createCard(CardName.SIGNAL_PEST, CardClassification.COST_1, 4));
		deckList.addAll(Utils.createCard(CardName.VAULT_SKIRGE, CardClassification.COST_1, 4));
		deckList.addAll(Utils.createCard(CardName.GALVANIC_BLAST, CardClassification.DIRECT_DAMAGE, 4));
		deckList.addAll(Utils.createCard(CardName.MOX_OPAL, CardClassification.MANA_SOURCE_M, 4));
		deckList.addAll(Utils.createCard(CardName.SPRINGLEAF_DUM, CardClassification.MANA_SOURCE_N, 4));
		
		return deck;
	}
	
}

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
//		deckList.addAll(Utils.createCard(CardName.WELDING_JAR, CardClassification.COST_0, 2));
		deckList.addAll(Utils.createCard(CardName.SIGNAL_PEST, CardClassification.COST_1, 4));
		deckList.addAll(Utils.createCard(CardName.VAULT_SKIRGE, CardClassification.COST_1, 4));
		deckList.addAll(Utils.createCard(CardName.GALVANIC_BLAST, CardClassification.DIRECT_DAMAGE, 4));
		deckList.addAll(Utils.createCard(CardName.MOX_OPAL, CardClassification.MANA_SOURCE_M, 4));
		deckList.addAll(Utils.createCard(CardName.SPRINGLEAF_DRUM, CardClassification.MANA_SOURCE_N, 4));
		
		return deck;
	}
	
	public static Deck trueAffinity() {
		Deck deck = new Deck();
		
		deck.setName("True Affinity");
		
		List<Card> deckList = deck.getDeckList();
		
		deckList.addAll(Utils.createCard(CardName.MOUNTAIN, CardClassification.LAND, 1));
		deckList.addAll(Utils.createCard(CardName.BLINKMOTH_NEXUS, CardClassification.LAND, 4));
		deckList.addAll(Utils.createCard(CardName.CONTESTED_WZ, CardClassification.LAND, 3));
		deckList.addAll(Utils.createCard(CardName.DARKSTEEL_CITADEL, CardClassification.LAND, 4));

		deckList.addAll(Utils.createCard(CardName.ARCBOUND_RAVAGER, CardClassification.BOMB_2, 4));
		deckList.addAll(Utils.createCard(CardName.CRANIAL_PLATING, CardClassification.BOMB_2, 4));
		
		deckList.addAll(Utils.createCard(CardName.FROGMITE, CardClassification.AFFINITY_4, 4));
		deckList.addAll(Utils.createCard(CardName.MYR_ENFORCER, CardClassification.AFFINITY_7, 4));
		
		deckList.addAll(Utils.createCard(CardName.BOMAT_COURIER, CardClassification.COST_1, 2));
		deckList.addAll(Utils.createCard(CardName.SIGNAL_PEST, CardClassification.COST_1, 4));
		deckList.addAll(Utils.createCard(CardName.VAULT_SKIRGE, CardClassification.COST_1, 4));
		
		deckList.addAll(Utils.createCard(CardName.MEMNITE, CardClassification.COST_0, 4));
		deckList.addAll(Utils.createCard(CardName.ORNITHOPTER, CardClassification.COST_0, 4));
		deckList.addAll(Utils.createCard(CardName.CHALICE_VOID, CardClassification.COST_0, 2));
		deckList.addAll(Utils.createCard(CardName.WELDING_JAR, CardClassification.COST_0, 4));

		deckList.addAll(Utils.createCard(CardName.MOX_OPAL, CardClassification.MANA_SOURCE_M, 4));
		deckList.addAll(Utils.createCard(CardName.SPRINGLEAF_DRUM, CardClassification.MANA_SOURCE_N, 4));
		
		return deck;
	}
	
	public static Deck burn() {
		Deck deck = new Deck();
		
		deck.setName("RDW");
		
		List<Card> deckList = deck.getDeckList();
		
		deckList.addAll(Utils.createCard(CardName.ARID_MESA, CardClassification.LAND, 2));
		deckList.addAll(Utils.createCard(CardName.BLOODSTAINED_MIRE, CardClassification.LAND, 4));
		deckList.addAll(Utils.createCard(CardName.INSPIRING_VANTAGE, CardClassification.LAND, 3));
		deckList.addAll(Utils.createCard(CardName.MOUNTAIN, CardClassification.LAND, 3));
		deckList.addAll(Utils.createCard(CardName.SACRED_FOUNDRY, CardClassification.LAND, 2));
		deckList.addAll(Utils.createCard(CardName.STOMPING_GROUND, CardClassification.LAND, 1));
		deckList.addAll(Utils.createCard(CardName.WOODED_FOOTHILLS, CardClassification.LAND, 4));
		
		deckList.addAll(Utils.createCard(CardName.EIDOLON_GR, CardClassification.CREATURE_BURN_2, 4));
		deckList.addAll(Utils.createCard(CardName.GOBLIN_GUIDE, CardClassification.CREATURE_BURN_1, 4));
		deckList.addAll(Utils.createCard(CardName.GRIM_LAVA, CardClassification.CREATURE_BURN_1, 1));
		deckList.addAll(Utils.createCard(CardName.MONASTERY_SWIFTSPEAR, CardClassification.CREATURE_BURN_1, 4));
		
		deckList.addAll(Utils.createCard(CardName.BOROS_CHARM, CardClassification.DIRECT_DAMAGE_BURN_2, 4));
		deckList.addAll(Utils.createCard(CardName.LAVA_SPIKE, CardClassification.DIRECT_DAMAGE_BURN_1, 4));
		deckList.addAll(Utils.createCard(CardName.LIGHTNING_BOLT, CardClassification.DIRECT_DAMAGE_BURN_1, 4));
		deckList.addAll(Utils.createCard(CardName.LIGHTNING_HELIX, CardClassification.DIRECT_DAMAGE_BURN_2, 4));
		deckList.addAll(Utils.createCard(CardName.RIFT_BOLT, CardClassification.DIRECT_DAMAGE_BURN_1, 4));
		deckList.addAll(Utils.createCard(CardName.SEARING_BLAZE, CardClassification.DIRECT_DAMAGE_BURN_2, 4));
		deckList.addAll(Utils.createCard(CardName.SKULLCRACK, CardClassification.DIRECT_DAMAGE_BURN_2, 4));
		
		return deck;
	}
	
}

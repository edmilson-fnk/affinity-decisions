package mtg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mtg.deck.Card;
import mtg.deck.Deck;
import mtg.game.Shuffling;
import mtg.utils.Lists;
import mtg.utils.Utils;

public class Statistics {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		int qtd = 5000000;
		
		for (int i = 0; i < qtd; i++) {
			Shuffling.shuffleCards(deck);
			
			List<Card> mao = Shuffling.draw7(deck);
			
			String hash = Utils.hash(mao);
			
			if (!mapa.containsKey(hash)) {
				mapa.put(hash, 0);
			}
			
			mapa.put(hash, mapa.get(hash) + 1);
			
			Shuffling.reshuffleHand(deck, mao);
		}
		
		for (Entry<String, Integer> entrada : mapa.entrySet()) {
			float num = entrada.getValue().floatValue()/qtd;
			
			if (num > 0.0052) {
				String chave = entrada.getKey();
				System.out.println(num + " " + chave);
			}
		}
	}
	
}

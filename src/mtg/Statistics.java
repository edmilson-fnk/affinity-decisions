package mtg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import mtg.deck.Deck;
import mtg.game.Hand;
import mtg.game.Library;
import mtg.game.Shuffling;
import mtg.utils.Lists;

public class Statistics {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		Map<String, Integer> map = new HashMap<String, Integer>();
		int qtd = 1000000;
		
		for (int i = 0; i < qtd; i++) {
			Library library = Shuffling.shuffleDeck(deck);
			
			Hand hand = library.draw(6);
			
			String hash = hand.getHash();
			
			if (!map.containsKey(hash)) {
				map.put(hash, 0);
			}
			
			map.put(hash, map.get(hash) + 1);
		}
		
		for (Entry<String, Integer> entrada : map.entrySet()) {
			float num = entrada.getValue().floatValue()/qtd;
			
			if (num > 0.0072) {
				String chave = entrada.getKey();
				System.out.println(num + " " + chave);
			}
		}
	}
	
}

package mtg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mtg.deck.Card;
import mtg.deck.Deck;
import mtg.deck.Lists;
import mtg.jogo.Shuffling;
import mtg.utils.Utils;

public class Estatistica {

	public static void main(String[] args) {
		Deck deck = Lists.affinity();
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		int qtd = 500000;
		
		for (int i = 0; i < qtd; i++) {
			Shuffling.shuffleCards(deck);
			
			List<Card> mao = deck.draw(7);
			
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

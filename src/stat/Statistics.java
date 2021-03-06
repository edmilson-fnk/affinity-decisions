package stat;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
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
//		Deck deck = Lists.trueAffinity();
//		Deck deck = Lists.burn();
		
		Map<String, Float> probs = getProbabilities(deck);
		
//		greaterThan(probs);
		topN(probs);
		
		String hand = ".*0.*B.*L.*L.*M.*";
//		String hand = "0.*B.*L.*M.*N.*";
		Float p = getHandProbability(probs, hand);
		System.out.println(String.format(Locale.ENGLISH, "Probability of hand {" + hand + "}: %.5f%%", p*100));
	}

	private static void greaterThan(Map<String, Float> probs) {
		double perc = 0.004;
		Map<String, Float> greater = getMostProbables(probs, perc);
		println(greater, String.format(Locale.ENGLISH, "More probable than %.2f%%", perc*100));
	}

	private static void topN(Map<String, Float> probs) {
		int num = 5;
		Map<String, Float> most = getMostProbables(probs, num);
		println(most, String.format(Locale.ENGLISH, "Top %d common hands", num));
	}

	private static Float getHandProbability(Map<String, Float> probs, String handRegex) {
		Float p = 0f;
		for (Entry<String, Float> e : probs.entrySet()) {
			if (matchHand(e.getKey(), handRegex)) {
				p += e.getValue();
			}
		}
		
		return p;
	}

	private static boolean matchHand(String hand, String regex) {
		return hand.matches(regex);
	}

	private static void println(Map<String, Float> map, String title) {
		System.out.println(title + ":");
		for (Entry<String, Float> entry : map.entrySet()) {
			System.out.println(String.format(Locale.ENGLISH, "%s %.5f%%", entry.getKey(), entry.getValue()*100));
		}
		System.out.println();
	}

	private static Map<String, Float> getMostProbables(Map<String, Float> probs, Integer quant) {
		Comparator<Entry<String, Float>> comparator = new Comparator<Entry<String, Float>>() {
			@Override
			public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
				return -o1.getValue().compareTo(o2.getValue());
			}
		};
		
		LinkedList<Entry<String, Float>> list = new LinkedList<Entry<String, Float>>();
		list.addAll(probs.entrySet());
		
		Collections.sort(list, comparator);
		
		Map<String, Float> map = new HashMap<>();
		for (Entry<String, Float> e : list.subList(0, 5)) {
			map.put(e.getKey(), e.getValue());
		}
		
		return map;
	}
	
	private static Map<String, Float> getMostProbables(Map<String, Float> probs, Double minProb) {
		Map<String, Float> newMap = new HashMap<String, Float>();
		
		for (Entry<String, Float> entry : probs.entrySet()) {
			if (entry.getValue() >= minProb) {
				newMap.put(entry.getKey(), entry.getValue());
			}
		}
		
		return newMap;
	}

	private static Map<String, Float> getProbabilities(Deck deck) {
		Map<String, Float> map = new HashMap<String, Float>();
		int qtd = 5000000;
		
		for (int i = 0; i < qtd; i++) {
			Library library = Shuffling.shuffleDeck(deck);
//			Library library = Shuffling.pileShuffleDeck(deck, 7);
			
			Hand hand = library.draw(7);
			
			String hash = hand.getHash();
			
			if (!map.containsKey(hash)) {
				map.put(hash, 0f);
			}
			
			map.put(hash, map.get(hash) + 1f);
		}
		
		for (Entry<String, Float> entrada : map.entrySet()) {
			float num = entrada.getValue().floatValue()/qtd;
			map.put(entrada.getKey(), num);
		}
		
		return map;
	}
	
}

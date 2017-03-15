package mtg.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mtg.deck.Card;
import mtg.deck.enums.CardName;
import mtg.deck.enums.CardClassification;

public class Utils {

	public static String hash(List<Card> cartas) {
		Comparator<Card> comp = new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getClassification().getCode().compareTo(c2.getClassification().getCode());
			}
		};
		
		Collections.sort(cartas, comp);
		
		StringBuilder sb = new StringBuilder();
		for (Card c : cartas) {
			sb.append(c.getClassification().getCode());
		}
		
		return sb.toString();
	}
	
	public static void listCards(List<Card> cartas) {
		for (Card c : cartas) {
			System.out.println(c.getName());
		}
	}

	public static void showList(List<Card> cartas) {
		Map<CardName, Integer> mapa = new HashMap<CardName, Integer>();
		
		for (Card c : cartas) {
			CardName nome = c.getName();
			
			if (!mapa.containsKey(nome)) {
				mapa.put(nome, 0);
			}
			
			mapa.put(nome, mapa.get(nome)+ 1);
		}
		
		for (CardName nome : mapa.keySet()) {
			System.out.println(mapa.get(nome) + " " + nome);
		}
	}

	public static List<Card> createCard(CardName nome, CardClassification tipo, int qtd) {
		List<Card> lista = new LinkedList<Card>();
		for (int i = 0; i < qtd; i++) {
			lista.add(new Card(nome, tipo));
		}
		
		return lista;
	}
	
}

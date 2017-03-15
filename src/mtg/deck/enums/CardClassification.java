package mtg.deck.enums;

public enum CardClassification {

	MANA_SOURCE_M("Mana Source M", "M"),
	MANA_SOURCE_N("Mana Source N", "N"),
	BOMB_2("Bomb 2","B"),
	BOMB_3("Bomb 3","P"),
	COST_0("Cost 0","0"),
	COST_1("Cost 1","1"),
	DIRECT_DAMAGE("Damage","D"),
	DRAW("Draw","A"),
	REMOVAL("Removal","R"),
	LAND("Land","L");
	
	String name;
	String code;
	
	CardClassification(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}
	
}

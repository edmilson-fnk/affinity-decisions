package mtg.deck.enums;

public enum CardName {

	DARKSTEEL_CITADEL("Darksteel Citadel"),
	INKMOTH_NEXUS("Inkmoth Nexus"),
	BLINKMOTH_NEXUS("Blinkmoth Nexus"),
	GLIMMERVOID("Glimmervoid"),
	MOUNTAIN("Mountain"),
	ISLAND("Island"),
	ORNITHOPTER("Ornithopter"),
	MEMNITE("Memnite"),
	MOX_OPAL("Mox Opal"),
	GALVANIC_BLAST("Galvanic Blast"),
	SPRINGLEAF_DUM("Springleaf Drum"),
	SIGNAL_PEST("Signal Pest"),
	VAULT_SKIRGE("Vault Skirge"),
	CRANIAL_PLATING("Cranial Plating"),
	ARCBOUND_RAVAGER("Arcbound Ravager"),
	STEEL_OVERSEER("Steel Overseer"),
	MASTER_ETHERIUM("Master of Etherium"),
	ETCHED_CHAMPION("Etched Champion"),
	THOUGHTCAST("THoughtcast"),
	SPELLSKITE("Spellskite")
	;

	String nome;
	
	CardName(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}

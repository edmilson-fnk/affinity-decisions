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
	SPRINGLEAF_DRUM("Springleaf Drum"),
	SIGNAL_PEST("Signal Pest"),
	VAULT_SKIRGE("Vault Skirge"),
	CRANIAL_PLATING("Cranial Plating"),
	ARCBOUND_RAVAGER("Arcbound Ravager"),
	STEEL_OVERSEER("Steel Overseer"),
	MASTER_ETHERIUM("Master of Etherium"),
	ETCHED_CHAMPION("Etched Champion"),
	THOUGHTCAST("THoughtcast"),
	SPELLSKITE("Spellskite"),
	
	WELDING_JAR("Welding Jar"),
	FROGMITE("Frogmite"),
	MYR_ENFORCER("Myr Enforcer"),
	CHALICE_VOID("Chalice of the Void"),
	CONTESTED_WZ("Contested War Zone"),
	BOMAT_COURIER("Bomat Courier"),
	
	ARID_MESA("Arid Mesa"),
	BLOODSTAINED_MIRE("Bloodstained Mire"),
	INSPIRING_VANTAGE("Inspiring Vantage"),
	SACRED_FOUNDRY("Sacred Foundry"),
	STOMPING_GROUND("Stomping Ground"),
	WOODED_FOOTHILLS("Wooded Foothills"),
	EIDOLON_GR("Eidolon of the Great Revel"),
	GOBLIN_GUIDE("Goblin Guide"),
	GRIM_LAVA("Grim Lavamancer"),
	MONASTERY_SWIFTSPEAR("Monastery Swiftspear"),
	BOROS_CHARM("Boros Charm"),
	LAVA_SPIKE("Lava Spike"),
	LIGHTNING_BOLT("Lightning Bolt"),
	LIGHTNING_HELIX("Lightning Helix"),
	RIFT_BOLT("Rift Bolt"),
	SEARING_BLAZE("Searing Blaze"),
	SKULLCRACK("Skullcrak")
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

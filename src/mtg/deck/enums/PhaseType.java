package mtg.deck.enums;

public enum PhaseType {

	BEGGINING (0, StepType.UNTAP, StepType.UPKEEP, StepType.DRAW),
	MAIN_1 (1),
	COMBAT (2, StepType.BEGGINING_OF_COMBAT, StepType.DECLARE_ATTACKERS, StepType.DECLARE_BLOCKERS, StepType.COMBAT_DAMAGE, StepType.END_OF_COMBAT),
	MAIN_2 (3),
	ENDING (4, StepType.END_STEP, StepType.CLEAN_UP);

	PhaseType(int order, StepType... steps) { }
	
}

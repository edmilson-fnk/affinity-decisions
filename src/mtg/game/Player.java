package mtg.game;

public class Player {

	private String name;
	private Library library;
	private Hand hand;

	public Player(String name) {
		this.name = name;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void drawHand() {
		int num = 0;
		if (this.hand == null) {
			num = 7;
		} else {
			num = this.hand.size() - 1;
		}
		
		this.hand = this.library.draw(num);
	}

	public void mulligan() {
		library = Shuffling.shuffleDeck(library.getDeck());
		
		drawHand();
	}
	
}

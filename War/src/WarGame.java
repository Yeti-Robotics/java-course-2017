
public class WarGame {

	public static void main(String[] args) {
		Card card = new Card("A", "\u2660", 1);
		System.out.println(card);
		
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
	}

}


public class Card {

	public String rank;
	public String suit;
	public int value;
	
	public Card(String cardRank, String cardSuit, int cardValue) {
		rank = cardRank;
		suit = cardSuit;
		value = cardValue;
	}
	
	@Override
	public String toString() {
		return suit + rank;
	}
}

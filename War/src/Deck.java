import java.util.Arrays;
import java.util.Random;

public class Deck {

	public Card[] cards;

	public Deck() {
		String[] suits = new String[] { "\u2660", "\u2665", "\u2666", "\u2663" };
//		String[] suits = new String[] { "!", "@", "#", "$" };
		String[] ranks = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		cards = new Card[52];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				int position = (i * ranks.length) + j;
				cards[position] = new Card(ranks[j], suits[i], j + 1);
			}
		}
	}
	
	public void shuffle() {
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int from = i;
			int to = random.nextInt(cards.length);
			Card temp = cards[from];
			cards[from] = cards[to];
			cards[to] = temp;
		}
	}
	
	public Card[] dealPlayer1Cards() {
		return Arrays.copyOfRange(cards, 0, cards.length / 2);
	}
	
	public Card[] dealPlayer2Cards() {
		return Arrays.copyOfRange(cards, cards.length / 2, cards.length);
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < cards.length; i++) {
			result += cards[i] + "\n";
		}
		return result;
	}
}

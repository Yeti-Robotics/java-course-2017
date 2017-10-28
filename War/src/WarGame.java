
public class WarGame {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("antoine", deck.dealPlayer1Cards());
		System.out.println(player1);
		
		Player player2 = new Player("player2", deck.dealPlayer2Cards());
		System.out.println(player2);
		
		for (int i = 0; i < player1.cards.length; i++) {
			Card player1Card = player1.cards[i];
			Card player2Card = player2.cards[i];
			
			System.out.println(player1Card + " vs " + player2Card);
			
			if (player1Card.value > player2Card.value) {
				player1.score++;
			} else if (player2Card.value > player1Card.value) {
				player2.score++;
			} else {
				System.out.println("You both lose");
			}
			
		}
		
		System.out.println(player1);
		System.out.println(player2);
		
		if (player1.score > player2.score) {
			System.out.println(player1.name + " wins!");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " wins!");
		} else {
			System.out.println("You both lose.....good job!");
		}
	}

}


public class Player {
	
	public int score;
	public String name;
	public Card[] cards;
	
	public Player(String playerName, Card[] playerCards) {
		name = playerName;
		cards = playerCards;
	}
	
	@Override
	public String toString() {
		return name + " " + score;
	}
	
}

public class WarPlayer {
	private int stockpile;
	private int numPlayers = 0;	
	private int points;
	private String name;
	
	//Post: initializes sharedStockpile and points to 0
	//      and automatically names the player
	public WarPlayer() {
		stockpile = 0;
		points = 0;
		numPlayers++;
		name = "Player" + numPlayers;
	}
	
	//Post: Generates a random card value, displays the player name
	//      and face value (Ace, 2, etc), and returns the random value
	public int drawCard() {
		//Your code here		
	}
	
	//Post: Gives the player 2 points, the stockpile, and resets the stockpile to 0
	//      If the stockpile was awarded, a message is displayed
	public void givePoints() {
		points += 2;
		System.out.println(name + " wins");
		if(stockpile > 0) {
			System.out.println("Stockpile awarded to " + name);
			points += stockpile;
			stockpile = 0;			
		}
	}
	
	//Pre:  The "war" was a tie
	//Post: Adds to the stockpile and displays confirmation message
	public void addToStockPile() {
		System.out.println("Tie - 8 points go to stockpile");
		stockpile += 8;
	}
	
	//Post: returns a string containing the players name and points
	public String toString() {
		return name + " has " + points + " points";
	}

	//Post: returns the current number of points
	public int getPoints() {
		return points;
	}
}

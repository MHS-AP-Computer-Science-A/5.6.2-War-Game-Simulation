public class Main
{
    public static void main(String[] args)
    {
        WarPlayer player1 = new WarPlayer();
		WarPlayer player2 = new WarPlayer();
		
		while(player1.getPoints() < 52 && player2.getPoints() < 52) {
			int p1Card = player1.drawCard(); //returns 1-13
			int p2Card = player2.drawCard(); //returns 1-13
			
			//Award 2 points to the winning player
			if(p1Card < p2Card) {
				player2.givePoints();
			}
			else if(p1Card > p2Card) {
				player1.givePoints();
			}
			else {
				//If tie, award 8 points to stockpile
				//the next player to win will get these points
				player1.addToStockPile();
			}
			
			//Display the current totals
			System.out.println(player1);
			System.out.println(player2);	
			System.out.println("");
		}
		
		//Determine final winner
		if(player1.getPoints() > player2.getPoints()) {
			System.out.println("Player1 Won!");
		}
		else if(player1.getPoints() < player2.getPoints()) {
			System.out.println("Player2 Won!");
		}
		else {
			System.out.println("Tie!");
		}
    }
}

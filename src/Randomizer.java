public class Randomizer {
	
	//Post: returns a random from 0-9
	public static int nextInt() {
		return (int)(Math.random() * 10);
	}

	//Post: returns a random from start to stop (inclusive)
	public static int nextInt(int start, int stop) {
		return (int)(Math.random() * (stop - start + 1) + start);
	}
	
}

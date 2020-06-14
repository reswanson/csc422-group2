public class GameController {

	public static void main(String[] args) {

		boolean running = true;
		boolean isStopping = false;

		int maxLoopCounter = 10;
		int loopCount = 1;
		// Main Game Loop

		System.out.println("Zombie War");
		System.out.println("---------------------");
		while (running) {

			System.out.println("Round: " + loopCount);

			maxLoopCounter--;
			loopCount++;

			if (isStopping || maxLoopCounter <= 0)
				running = false;
		}

	}
}

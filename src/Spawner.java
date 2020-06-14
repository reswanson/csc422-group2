import java.util.ArrayList;

public final class Spawner {

	public static final int MAX_CAPACITY = 20;

	public static ArrayList<IZombie> spawnRandomZombies() {

		ArrayList<IZombie> zombies = new ArrayList<IZombie>(MAX_CAPACITY);
		
		
		int numOfCharacters = 0; //stores the random number of characters
		
		int random = (int) (Math.random() * 20 + 5); //generates integer between 5-20

		numOfCharacters = random; 
		
		// For as many zombies as there are, spawn a zombie
		for (int i = 0; i < numOfCharacters; i++) {

			random = (int) (Math.random() * 2 + 1);

			switch (random) {

			// if randomly chosen to be 1, create common
			case 1:
				zombies.add(new ZombieCommon());
				break;

			// if randomly chosen to be 2, create tank
			case 2:
				zombies.add(new ZombieTank());
				break;

			}
		}

		// return ArrayList of IZombies
		return zombies;

	}

	public static ArrayList<ISurvivor> spawnRandomSurvivors() {
		// Survivor class not yet implemented
		return null;
	}

}

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

//class that generates the Survivors and Zombies 
public class Spawner {

	
	
	// max number of survivors or zombies
	public static final int MAX_CAPACITY = 20;

	// returns an ArrayList that will hold all Zombie types
	public static ArrayList<ICharacter> spawnRandomZombies() {

		ArrayList<ICharacter> zombies = new ArrayList<>(MAX_CAPACITY);
		Random rand = new Random();
		int totalZombies = 5 + rand.nextInt(15 + 1);

		// For as many zombies as there are, spawn a zombie
		for (int i = 0; i < totalZombies; i++) {

			int randomZombie = rand.nextInt(2);

			switch (randomZombie) {
			// if randomly chosen to be 0, create common
			case 0:
				zombies.add(new ZombieCommon());
				break;

			// if randomly chosen to be 1, create tank
			case 1:
				zombies.add(new ZombieTank());
				break;
			}
		}

		// return ArrayList of IZombies
		return zombies;
	}

	// returns an ArrayList that will hold all Survivor types
	public static ArrayList<ICharacter> spawnRandomSurvivors() {
		ArrayList<ICharacter> survivors = new ArrayList<>(MAX_CAPACITY);

		Random rand = new Random();
		int totalHumans = 5 + rand.nextInt(15 + 1);

		// spawn random survivor classes (soldier,teacher,child)
		for (int i = 0; i < totalHumans; i++) {

			int randomHuman = rand.nextInt(3);

			// get a random number thats between 0 and the max number of weapons in the cache
			int theirWeapon=2;
			
			switch (randomHuman) {
			// if randomly chosen to be 0, create soldier
			case 0:
				survivors.add(new Soldier());
				break;

			// if randomly chosen to be 1, create teacher
			case 1:
				survivors.add(new Teacher());
				break;

			// if randomly chosen to be 2, create child
			case 2:
				survivors.add(new Child());
				break;
			}
		
		}

		// return ArrayList of survivors
		return survivors;
	}

	public static ArrayList<IWeapon> spawnWeaponCache() {
		ArrayList<IWeapon> cache = new ArrayList<>(MAX_CAPACITY);
		
		Random rand = new Random();
		int totalWeapons = 5 + rand.nextInt(15 + 1);
		
		for (int i = 0; i < totalWeapons; i++) {
			int randomWeapon = rand.nextInt(8);
			
			switch (randomWeapon) {
			case 0:
				//Set to shotgun 
				cache.add(new Weapon(507114100));
				break;
			case 1:
				//Set to Submachine Gun 
				cache.add(new Weapon(507114200));
				break;
			case 2:
				//Set to Assault Rifle
				cache.add(new Weapon(507114250));
				break;
			case 3:
				//Set to Pistol 
				cache.add(new Weapon(507114300));
				break;
			case 4:
				//Set to Axe 
				cache.add(new Weapon(507114500));
				break;
			case 5:
				//Set to Crowbar 
				cache.add(new Weapon(507114510));
				break;
			case 6:
				//Set to Frying Pan 
				cache.add(new Weapon(507114520));
				break;
			case 7:
				//Set to Katana 
				cache.add(new Weapon(507114530));
				break;
			
			
			}
		}
		
		return cache;


	}
}
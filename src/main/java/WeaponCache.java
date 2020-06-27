import java.util.ArrayList;
import java.util.Random;

public class WeaponCache {

	private ArrayList<Weapon> cache = new ArrayList<Weapon>(20);
	
	public WeaponCache() {

		for(int i = 0; i < 20; i++) {
			Random rand = new Random();
			int randomWeapon = rand.nextInt(8 + 1);
			
			Weapon weapon = AssetLoader.weapons.get(randomWeapon);
			
			cache.add(weapon);
		}
	}
	
	public Weapon getWeapon( ) {
		return cache.remove(0);
	}
	
	public void printCache() {
		for(Weapon weapon : cache) {
			System.out.println(weapon);
		}
	}
}

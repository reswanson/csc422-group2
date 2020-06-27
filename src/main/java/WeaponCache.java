import java.util.ArrayList;
import java.util.Random;

public class WeaponCache {

	
	private ArrayList<IWeapon> cache = new ArrayList<IWeapon>(20);
	
	public WeaponCache() {
		
		
	}

	public void add(Weapon wep) {
		cache.add(wep);
		
	}
	public void get(int id) {
		cache.get(id);
	}
	public int size() {
		return cache.size();
	}
	public boolean isEmpty() {
		return cache.size()==0;
	}
	public IWeapon getWeapon( ) {
		return cache.remove(0);
	}
	
	public void printCache() {
		for(IWeapon weapon : cache) {
			System.out.println(weapon);
		}
	}
	
	
}

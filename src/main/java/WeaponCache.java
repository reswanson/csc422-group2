import java.util.ArrayList;

public class WeaponCache {

	private ArrayList<Weapon> cache = new ArrayList<Weapon>(20);
	
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
		if(!cache.isEmpty())
		return cache.remove(0);
		else return null;
  }
	
	public void printCache() {
		for(IWeapon weapon : cache) {
			System.out.println(weapon);
		}
	}
}

import java.util.ArrayList;
import java.util.Random;

public class WeaponCache {

	
	private ArrayList<IWeapon> cache = new ArrayList<IWeapon>(20);
	
	public WeaponCache() {
		
		for(int i=0;i<20;i++) {
			int rand = (int) (Math.random()*(10));
			System.out.println(rand);
			
		}
		
	}
	
	
	
}

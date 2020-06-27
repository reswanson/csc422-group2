
public class Weapon implements IWeapon {

	private int guid;
	private double accuracy;
	private double damage;

	private String name;

	public Weapon() {

	}

	public Weapon(int guid, double accuracy, double damage) {

		this.guid = guid;
		this.accuracy = accuracy;
		this.damage = damage;

		
	}
	public Weapon(int guidIn) {
		
		
		guid = guidIn;
		accuracy = AssetLoader.weapons.get(guidIn).getAccuracy();
		damage = AssetLoader.weapons.get(guidIn).getDamage();
		name = AssetLoader.weaponsNameById.get(guidIn);

		
	}

	

	public int getId() {

		return guid;
	}

	public double getAccuracy() {

		return accuracy;
	}
	
	public double getDamage() {
		return damage;
	}
	
	public String getName() {
		return name;
	}

	public void setDamage(double d) {
		
		damage = d;
		
	}
	
	public String toString() {  //Redundent, do we need this? see getName()
		return name;
	}

}

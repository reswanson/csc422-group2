
public class Weapon implements IWeapon {

	private int guid;
	private String name;
	private double accuracy;
	private double damage;
	
	public Weapon() {

	}

	public Weapon(int guid, String name, double accuracy, double damage) {

		this.guid = guid;
		this.name = name;
		this.accuracy = accuracy;
		this.damage = damage;
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
	
	public int getNumOfWeapons() {
		// return number of weapons in total cache;
		return 1;
	}

	
	public String getName() {
		return name;
	}

		@Override
	public void setDamage(double damage) {
		// TODO Auto-generated method stub

	}

}

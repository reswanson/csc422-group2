
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
	
	public String getName() {
		return name;
	}

	public void setDamage(double d) {
		
		damage = d;
		
	}	
}


public class Weapon implements IWeapon {

	private int guid;
	private double accuracy;
	private double damage;

	public Weapon() {

	}

	public Weapon(int guid, double accuracy, double damage) {

		this.guid = guid;
		this.accuracy = accuracy;
		this.damage = damage;
		
	}
	public Weapon(int guid) {

		this.guid = guid;
		this.accuracy = 0;
		this.damage = 0;
		//TODO Update getAccuracy and getDamage methods to make this constructor work. 
		//currently sets accuracy and damage to 0
		
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



}

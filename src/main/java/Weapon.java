
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
	

	public int getId() {

		return guid;
	}


	@Override
	public void setDamage(double damage) {
		// TODO Auto-generated method stub

	}

}

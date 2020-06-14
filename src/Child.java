
public class Child implements ISurvivor{

	public Child() {	//Default Constructor, just creates object with default parameters
		
	}
	static final double maxHealth=20.0;
	static final double attack = 2.0;
	
	private boolean isAlive = true;
	private int id;
	private double currentHealth = maxHealth;
	
	
	public void attack(ICharacter victim) {
		
		victim.setCurrentHealth(victim.getCurrentHealth() - attack);
		
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getCurrentHealth()
	{
		return currentHealth;
	}
	
	public void setCurrentHealth(double d) {
		currentHealth = d;
	}


}

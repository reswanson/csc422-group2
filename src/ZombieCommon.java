
public class ZombieCommon  implements IZombie{

	public ZombieCommon() {
		
	}

	
	static final double maxHealth = 30.0;
	static final double attack = 5.0;

	private boolean isAlive = true;
	private int id;
	private double currentHealth = maxHealth;

	public double getHealth() {

		return currentHealth;

	}

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
	
	@Override 
	public String toString() {
		
		return "Common";
	}

}

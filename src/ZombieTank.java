
public class ZombieTank implements IZombie{

	public ZombieTank() {
		
	}
	
	static final double maxHealth = 150.0;
	static final double attack = 20.0;

	private boolean isAlive = true;
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

	@Override
	public double getCurrentHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCurrentHealth(double d) {
		currentHealth = d;
		
	}
	
	@Override 
	public String toString() {
		
		return "Tank";
	}

}

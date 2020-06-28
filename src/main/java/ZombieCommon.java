//class for the Common Infected zombie

public class ZombieCommon implements IZombie {
    private int health = 30;
    private int attack = 5;
    private static int nextId = 1;
    private int id;

    public ZombieCommon() { 
        id = nextId++;
    }

    @Override
    public int getHealth() {
	return health;
    }

    @Override
    public void attack(ICharacter victim) {
        victim.setHealth(victim.getHealth() - attack);
    }

    @Override
    public boolean isAlive() {
	return health > 0;
    }
    
    @Override
    public int getId() { 
        return id; 
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
	
    @Override
    public void setHealth(int health) {
	this.health = health;
    }

    @Override
    public String toString() {
        return "Common" + " " +  id;
    }

	@Override
	public double getAttack() {
		return attack;
	}
}
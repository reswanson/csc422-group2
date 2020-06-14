//class for the Tank Zombie

public class ZombieTank implements IZombie {
    private int health = 150;
    private int attack = 20;
    private static int nextId = 1;
    private int id;

    public ZombieTank() { 
        id = nextId++;
    }

    @Override
    public int getHealth() {
	return health;
    }

    @Override
    public void setHealth(int health) {
	this.health = health;
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
    public String toString() {
        return "Tank" + " " +  id;
    }
}
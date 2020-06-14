//class for the Child Survivor

public class Child implements ISurvivor {
    private int health = 20;
    private int attack = 2;
    private static int nextId = 1;
    private int id;

    public Child() { 
        id = nextId++;
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
    public int getHealth() {
        return health;
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
        return "Child";
    }
}

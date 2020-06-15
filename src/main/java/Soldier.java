//class for the Soldier Survivor

public class Soldier implements ISurvivor {
    private int health = 100;
    private int attack = 10;
    private static int nextId = 1;
    private int id;

    public Soldier() { 
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
        return String.format("Soldier %d", id);
    }
}

//class for the Teacher Survivor

public class Teacher implements ISurvivor {
	
    private int health = 50;
    private int attack = 5;
    private static int nextId = 1;
    private int id;
    private IWeapon heldWeapon;
	public boolean isSurvivor=true;


    public Teacher() { 
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
    
    public boolean isSurvivor() {
        return true;
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
        return "Teacher" + " " +  id;
    }

	@Override
	public void setWeapon(IWeapon w) {
		if(w != null) {
		heldWeapon = w;
		attack = (int) heldWeapon.getDamage();
		}
	}

	@Override
	public IWeapon getWeapon() {
		return heldWeapon;
	}

	@Override
	public double getAttack() {
		return attack;
	}
	
	@Override
	public void setAttack(int attack) {
		attack = (int) heldWeapon.getDamage();
		
	}
}

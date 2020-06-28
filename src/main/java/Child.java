//class for the Child Survivor


public class Child implements ISurvivor {
	
    private int health = 20;
    private int attack = 2;
    private static int nextId = 1;
    private int id;
    private IWeapon heldWeapon;
	
	//default Child constructor 

    public Child() { 
        id = nextId++;
    }

	// Creates a Child with a Weapon 
	public Child(IWeapon w) {
		
	}




    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(ICharacter victim) {
    	
    	victim.setHealth(victim.getHealth() - attack);
    }

    public int getHealth() {
        return health;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public boolean isSurvivor() {
        return true;
    }

    public int getId() { 
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Child" + " " +  id;
    }


	public void setWeapon(IWeapon w) {
		if(w != null) {
		heldWeapon = w;
		attack = (int) heldWeapon.getDamage();
		}
	}
	
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

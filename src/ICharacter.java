
public interface ICharacter {
	
	double maxHealth=0;			//Maximum Health Value
	double currentHealth=0;			//Current Health Value
	double attack=0;			//Attack Value
	boolean isAlive=true;			//Boolean for alive status
	void attack(ICharacter victim);  			/*Perform attack on all living members of opposing faction 
								don't see any reason for return value*/
	double getCurrentHealth();			//Return current health
	void setCurrentHealth(double d);
	
	//Can add more attributes and methods if determined necessary later.
	
}

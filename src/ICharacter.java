
public interface ICharacter {
	
	double MaxHealth=0;			//Maximum Health Value
	double CurrentHealth=0;		//Current Health Value
	double Attack=0;			//Attack Value
	boolean IsAlive=true;		//Boolean for alive status
	void attack();  			/*Perform attack on all living members of opposing faction 
								don't see any reason for return value*/
	
	//Can add more attributes and methods if determined necessary later.
	
}

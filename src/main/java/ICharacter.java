public interface ICharacter {
	
    void attack(ICharacter victim);  	//Perform attack on all living members of opposing faction 

    int getHealth();			        //Return current health

    void setHealth(int health);         //Set character health
	
    int getId();                        //Get character ID

    void setId(int id);                 //Set character ID

    boolean isAlive();                  //Is the character still in the game?
}

public interface ICharacter {
	
    void attack(ICharacter victim);  	//Perform attack on all living members of opposing faction 

    int getHealth();			        //Return current health

    void setHealth(int health);         //set character health
	
    int getId();                        //get character id

    void setId(int id);                 //set character id

    boolean isAlive();                  //is the character still in the game?

    double getAttack();					//get attack power
}

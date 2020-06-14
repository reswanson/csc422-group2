import java.util.*;

public class GameController {
    //does all the fighting between Survivors and zombies
    public static void fightRound(ArrayList<ICharacter> attackers, ArrayList<ICharacter> defenders) {
        
        for(int i = 0; i < attackers.size(); i++) {
            for(int j = 0; j < defenders.size(); j++) {
            
            	ICharacter currentAttacker = attackers.get(i);
            	ICharacter currentDefender = defenders.get(j);
            	
            	
                currentAttacker.attack(currentDefender);

                if(!currentDefender.isAlive()) {
                	System.out.println("\t" + currentAttacker.toString() + " Killed " + currentDefender.toString());
                    defenders.remove(currentDefender);
                }
                if(defenders.isEmpty())
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        //Spawns the Survivors and Zombies for the game
        ArrayList<ICharacter> survivors = Spawner.spawnRandomSurvivors();
        ArrayList<ICharacter> zombies = Spawner.spawnRandomZombies();

        System.out.println("We have " + survivors.size() + " survivors trying to make it to safety.");
        System.out.println("But there are " + zombies.size() + " zombies waiting for them.");

        //keep fighting back and forth til either Survivors or Zombies are dead
        while(survivors.size() > 0 && zombies.size() > 0) {
            fightRound(survivors, zombies);

            if(zombies.isEmpty()) 
                break;

            fightRound(zombies, survivors);

            if(survivors.isEmpty()) 
                break;
        }

        if(survivors.size() > 0)
            System.out.println("It seems " + survivors.size() + " have made it to safety.");
        else
            System.out.println("None of the survivors made it");
    }
}

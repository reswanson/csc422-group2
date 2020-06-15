import java.util.*;
import com.csc422.localization.*;

public class GameController {
	public static ILocalization localization;
	
	/**
	 * Short-hand for System.out.println(String.format(formatStr, args))
	 * @param formatStr
	 * @param args
	 */
	private static void sprintf (String formatStr, Object ... args)
	{
		System.out.println(String.format(formatStr, args));
	}
	
	/**
     * Completes a round of attacks between attackers and defenders.
     * @param attackers
     * @param defenders
     */
    public static void fightRound(ArrayList<ICharacter> attackers, ArrayList<ICharacter> defenders) {
        
        for(int i = 0; i < attackers.size(); i++) {
            for(int j = 0; j < defenders.size(); j++) {
            
            	ICharacter currentAttacker = attackers.get(i);
            	ICharacter currentDefender = defenders.get(j);
            	
            	
                currentAttacker.attack(currentDefender);

                if(!currentDefender.isAlive()) {
                	
                	sprintf(localization.getUnitKilled(), 
                			currentAttacker, 
                			currentDefender);
                	
                    defenders.remove(currentDefender);
                }
                if(defenders.isEmpty())
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
    	//Initialize localization
    	localization = new LocalizationENUS();
    	
        //Spawns the Survivors and Zombies for the game
        ArrayList<ICharacter> survivors = Spawner.spawnRandomSurvivors();
        ArrayList<ICharacter> zombies = Spawner.spawnRandomZombies();

        int numOfTanks    = 0;
        int numOfCommon   = 0;
        int numOfChildren = 0;
        int numOfTeachers = 0;
        int numOfSoldiers = 0;

        //Gather numbers of each type of survivors
        for (ICharacter z : survivors) {
             if (z instanceof Soldier) {
                  numOfSoldiers++;
             } else if (z instanceof Teacher) {
                  numOfTeachers++;
             } else if (z instanceof Child ) {
                  numOfChildren++;
             }
        }

        //Gather numbers of each type of zombie
        for (ICharacter z : zombies) {
             if (z instanceof ZombieTank) {
                  numOfTanks++;
             } else if (z instanceof ZombieCommon) {
                  numOfCommon++;
             }
        }

        //Display number of survivors
        sprintf(localization.getSurvivorStatus(),
        		survivors.size(),
        		numOfChildren,
        		numOfTeachers,
        		numOfSoldiers);
        
        //Display number of zombies
        sprintf(localization.getZombieStatus(),
        		zombies.size(),
        		numOfCommon,
        		numOfTanks);

        //Keep fighting back and forth til either Survivors or Zombies are dead
        while (survivors.size() > 0 && zombies.size() > 0) {
            fightRound(survivors, zombies);

            if (zombies.isEmpty()) 
                break;

            fightRound(zombies, survivors);

            if (survivors.isEmpty()) 
                break;
        }

        if (survivors.size() > 0)
            sprintf(localization.getSurvivorsWon(), survivors.size());
        else
            sprintf(localization.getZombiesWon());
    }
}

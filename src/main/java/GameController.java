
import java.io.IOException;
import java.util.*;

public class GameController {
    //does all the fighting between Survivors and zombies
	
	
    public static void fightRound(ArrayList<ICharacter> attackers, ArrayList<ICharacter> defenders) {
        
        for(int i = 0; i < attackers.size(); i++) {
            for(int j = 0; j < defenders.size(); j++) {
            
            	
            	ICharacter currentAttacker = attackers.get(i);
            	ICharacter currentDefender = defenders.get(j);
            	
            	
                currentAttacker.attack(currentDefender);
                if(currentAttacker instanceof ISurvivor) {
                System.out.println(((ISurvivor) currentAttacker).getWeapon());
                }
                else {
                	
                	
                }
                if(!currentDefender.isAlive()) {
                	System.out.println("\t" + currentAttacker.toString() + " Killed " + currentDefender.toString());
                    defenders.remove(currentDefender);
                }
                if(defenders.isEmpty())
                    break;
            }
        }
    }
    
    public static void initializeAssets() {
    	
    	// Load weapon assets from weapons.json
		try {
			AssetLoader.readWeaponAssetsFromFile();
		} catch (IOException e) {

			e.printStackTrace();

		}
    	
    }
    public static void main(String[] args) {	
    	
    	
    	initializeAssets();
    	

    	//Spawns the weapons cache for the game
        ArrayList<IWeapon> cache = Spawner.spawnWeaponCache();
    	

    	/* Sample code I was learning how to access weapons
    	Weapon w = AssetLoader.weapons.get(3);
    	System.out.println("this is the 3th weapon");
    	System.out.println(w.getId());
    	System.out.println(w.getAccuracy());
    	System.out.println(w.getDamage());
    	System.out.println(w.getName());
    	
    	Weapon x = AssetLoader.weapons.get(0);
    	System.out.println("this is the 0th weapon");
    	System.out.println(x.getId());
    	System.out.println(x.getAccuracy());
    	System.out.println(x.getDamage());
    	System.out.println(x.getName());
      */

    	
        //Spawns the Survivors and Zombies for the game
        ArrayList<ICharacter> survivors = Spawner.spawnRandomSurvivors();
        ArrayList<ICharacter> zombies = Spawner.spawnRandomZombies();
        

        // get randnumber between 0 and w.getNumOfWeaponsInCache()
        //for each survivor, pick a random weapon from cache and assign to survivor using new method.


        int numOfTank=0;
        int numOfCommon=0;
        int numOfChild=0;
        int numOfTeacher=0;
        int numOfSoldier=0;

        //gather numbers of each type of survivors
        for (ICharacter z : survivors) {
             if(z instanceof Soldier ){
                  numOfSoldier += 1;
             } else if(z instanceof Teacher ) {
                  numOfTeacher +=1;
             } else if (z instanceof Child ) {
                  numOfChild +=1;
             }
        }

        //gather numbers of each type of zombie
        for (ICharacter z : zombies) {
             if (z instanceof ZombieTank) {
                  numOfTank += 1;
             } else if (z instanceof ZombieCommon) {
                  numOfCommon +=1;
             }
        }

        System.out.println("We have " + survivors.size() + " survivors trying to make it to safety: ( " + numOfChild + " children, " + numOfTeacher + " teachers, " + numOfSoldier + " soldiers )"  );
        System.out.println("But there are " + zombies.size() + " zombies waiting for them. ( " + numOfCommon + " common infected, " + numOfTank + " tanks )" );


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

import java.util.*;

//class that generates the Survivors and Zombies 
public class Spawner {

    //max number of survivors or zombies
    public static final int MAX_CAPACITY = 20;

    //returns an ArrayList that will hold all Zombie types
    public static ArrayList<ICharacter> spawnRandomZombies() {

        ArrayList<ICharacter> zombies = new ArrayList<>(MAX_CAPACITY);
        Random rand = new Random();
        int totalZombies = 5 + rand.nextInt(15 + 1);

        // For as many zombies as there are, spawn a zombie
        for (int i = 0; i < totalZombies; i++) {

            int randomZombie = rand.nextInt(2);

            switch (randomZombie) {
                // if randomly chosen to be 0, create common
                case ZombieType.COMMON:
                    zombies.add(new ZombieCommon());
                    break;

                // if randomly chosen to be 1, create tank
                case ZombieType.TANK:
                    zombies.add(new ZombieTank());
                    break;
            }
        }
        
        // return ArrayList of IZombies
        return zombies;
    }

    //returns an ArrayList that will hold all Survivor types
    public static ArrayList<ICharacter> spawnRandomSurvivors() {
        ArrayList<ICharacter> survivors = new ArrayList<>(MAX_CAPACITY);

        Random rand = new Random();
        int totalHumans = 5 + rand.nextInt(15 + 1);

        // spawn random survivor classes (soldier,teacher,child)
        for (int i = 0; i < totalHumans; i++) {

            int randomHuman = rand.nextInt(3);

            switch (randomHuman) {
                // if randomly chosen to be 0, create soldier
                case HumanType.SOLDIER:
                    survivors.add(new Soldier());
                    break;

                // if randomly chosen to be 1, create teacher
                case HumanType.TEACHER:
                    survivors.add(new Teacher());
                    break;

                // if randomly chosen to be 2, create child
                case HumanType.CHILD:
                    survivors.add(new Child());
                    break;
            }
        }

        // return ArrayList of survivors
        return survivors;
    }
}
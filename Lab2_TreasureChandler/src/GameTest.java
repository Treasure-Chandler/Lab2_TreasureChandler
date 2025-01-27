/**
 * @author Treasure Chandler
 */

import java.util.Arrays;        // Used to print String arrays
import java.util.Scanner;       // Used for user input

public class GameTest {
    /**
     * Program that will run this class along with the methods from
     * the Hero and Party classes
     * 
     * @param args      Entered values
     */
    public static void main(String[] args) {
        // Variables declaration
        Party party = new Party();
        String[] classNames = {"Assassin", "Bruiser", "Caster", "Healer", "Shooter", "Summoner",
                                "Tank"};
        Hero hero1 = new Hero("Evie");
        Hero hero2 = new Hero("Myra");
        Hero hero3 = new Hero("Kyra");
        Hero hero4 = new Hero("Stormy");
        Hero[] heroList = { hero1, hero2, hero3, hero4 };
        Scanner kbInput = new Scanner(System.in);
        String heroInput;

        // List the available classes and prompt the user to choose a class for each hero
        System.out.println("The available classes are: " + "\n" +
                            Arrays.toString(classNames) + "\n");

        for (Hero hero : heroList) {
            do {
                System.out.println("Choose a class for " + hero.getName() + ":");
                heroInput = kbInput.nextLine();
    
                /*
                 * If the user enters an invalid class, inform them to try again. Otherwise,
                 * set the class of each hero
                 */
                if (!Arrays.asList(classNames).contains(heroInput)) {
                    System.out.println("This is not a valid class name! " +
                                        "However, I admire your creativity.");
                } else {
                    hero.setHClass(heroInput);
                }
            } while (!Arrays.asList(classNames).contains(heroInput));
        }
        kbInput.close();

        // One of the heroes will be given a random level
        hero2.setRandomLevel();

        // Add 3 heroes in the party
        party.addHero(0, hero1);
        party.addHero(1, hero2);
        party.addHero(2, hero3);

        // Giving them experience and leveling them up
        party.gainExperience(55);

        // Print the party's current status
        System.out.println(party.toString());

        // Swap in the unused hero by removing a hero
        party.removeHero(0);
        party.addHero(0, hero4);

        // Give the party some more experience, and print the party's data again
        party.gainExperience(70);
        System.out.println(party.toString());
    } // End of main()
} // End of GameTest
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
        Party party;
        String[] classNames = {"Assassin", "Bruiser", "Caster", "Healer", "Shooter", "Summoner",
                                "Tank"};
        Hero hero1 = new Hero("Evie");
        Hero hero2 = new Hero("Myra");
        Hero hero3 = new Hero("Kyra");
        Hero hero4 = new Hero("Stormy");
        Hero hero5 = new Hero("Mercy");
        Hero hero6 = new Hero("Carys");
        Hero hero7 = new Hero("Autumn");
        Scanner kbInput = new Scanner(System.in);
        String heroInput;

        // List the available classes and prompt the user to choose a class for each hero
        System.out.println("The available classes are: " + "\n" +
                            Arrays.toString(classNames) + "\n" + 
                            "Please choose a class for your hero!");

        do {
            heroInput = kbInput.nextLine();

            /*
             * If the user enters an invalid class, inform them to try again. Otherwise,
             * set the class of each hero
             */
            if (!Arrays.asList(classNames).contains(heroInput)) {
                System.out.println("This is not a valid class name! Please try again.");
            } else {

            }
        } while (!Arrays.asList(classNames).contains(heroInput));
    } // End of main()
} // End of GameTest

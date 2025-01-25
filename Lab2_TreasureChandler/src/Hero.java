/**
 * @author Treasure Chandler
 */

import java.util.Random;        // Needed for the Random class

public class Hero {
    // Variables declaration
    private String name;
    private String hClass;
    private int level;
    private int experience;
    private int MAX_LEVEL = 10;
    private int[] LEVELS = { 5, 10, 15, 20, 30, 40, 50, 75, 100, 150 }; // 150 = Max EXP

    /**
     * Constructor that sets the hero's name and other default values
     * 
     * @param hName     Hero's name param
     */
    public Hero(String hName) {
        this.name = hName;
        this.hClass = "";
        this.level = 1;
        this.experience = 0;
    } // End of Hero()

    /**
     * Returns the hero's name
     * 
     * @return      Hero's name param
     */
    public String getName() {
        return this.name;
    } // End of getName()

    /**
     * Returns the hero's class
     * 
     * @return      Hero's class param
     */
    public String getHClass() {
        return this.hClass;
    } // End of getHClass()

    /**
     * Returns the hero's level
     * 
     * @return      Hero's level param
     */
    public int getLevel() {
        return this.level;
    } // End of getLevel()

    /**
     * Modifies the hero's name
     * 
     * @return      Hero's name param
     */
    public String setName(String n) {
        return this.name = n;
    } // End of setName()

    /**
     * Modifies the hero's class
     * 
     * @return      Hero's class param
     */
    public String setHClass(String h) {
        return this.hClass = h;
    } // End of setHClass()

    /**
     * Modifies the hero's level
     * 
     * @return      Hero's level param
     */
    public int setLevel(int l) {
        return this.level = l;
    } // End of setLevel()

    /**
     * Sets the level to be a random level between 1 and 10
     */
    public void setRandomLevel() {
        // Random declaration
        Random rand = new Random();

        // Sets the level to be a random value between 1 and 10
        level = rand.nextInt(10);

        System.out.println(name + "'s level was randomized to " + level);
    } // End of setRandomLevel

    /**
     * Increases the hero's experience, with certain conditions in place
     * 
     * @param exp        Hero's EXP
     */
    public void gainExperience(int exp) {
        // Increase the hero's EXP
        experience += exp;
        System.out.println("The party gained " + exp + " experience.");

        // Increase the hero's level through a check
        while (level < MAX_LEVEL && experience >= LEVELS[level - 1]) {
            experience -= LEVELS[level - 1];
            level++;
            System.out.println(name + " is now level " + level + "!");

            /*
             * If the current level is greater than or equal to the max level,
             * increase the level by 1, reset EXP to 0, and add any EXP that's
             * leftover.
             */
            if (level >= MAX_LEVEL) {
                experience = 0;
                break;
            }
        }
    } // End of gainExperience()

    /**
     * Returns a String containing information about the hero such as their
     * name, class, level, and amount of experience.
     */
    @Override
    public String toString() {
        String heroStats = name + " the " + hClass + " is level " + level + 
                            " with " + experience + " experience ";

        return heroStats;
    } // End of toString()
} // End of Hero
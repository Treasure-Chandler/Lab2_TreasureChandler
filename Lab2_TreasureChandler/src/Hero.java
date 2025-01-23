/**
 * @author Treasure Chandler
 */

public class Hero {
    // Variables declaration
    private String name;
    private String hClass;
    private int level;
    private int experience;
    private int MAX_LEVEL = 10;
    private int[] LEVELS = { 5, 10, 15, 20, 30, 40, 50, 75, 100, 150 }; // 150 = Max level

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
    } // End of Hero

    /**
     * Returns the hero's name
     * @return      Hero's name param
     */
    public String getName() {
        return this.name;
    } // End of getName()

    /**
     * Returns the hero's class
     * @return      Hero's class param
     */
    public String getHClass() {
        return this.hClass;
    } // End of getHClass()

    /**
     * Returns the hero's level
     * @return      Hero's level param
     */
    public int getLevel() {
        return this.level;
    } // End of getLevel()

    /**
     * Modifies the hero's name
     * @return      Hero's name param
     */
    public String setName(String n) {
        return this.name = n;
    } // End of setName()

    /**
     * Modifies the hero's class
     * @return      Hero's class param
     */
    public String setHClass(String h) {
        return this.hClass = h;
    } // End of setHClass()

    /**
     * Modifies the hero's level
     * @return      Hero's level param
     */
    public int getName(int l) {
        return this.level = l;
    } // End of setLevel()
} // End of Hero
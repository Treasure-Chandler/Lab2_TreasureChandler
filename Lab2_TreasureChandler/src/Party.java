/**
 * @author Treasure Chandler
 */

public class Party {
    // Variable declaration
    Hero[] heroes;

    /**
     * Initialize the empty "heroes" array to hold 3 heroes
     */
    public Party() {
        heroes = new Hero[3];
    } // End of Party()

    /**
     * Adds a hero to the current party at the given index.
     * If there is an existing hero at the index, replace it
     * 
     * @param index     Index
     * @param hero      Hero to be added to the party
     */
    public void addHero(int index, Hero hero) {
        // Check for handling invalid indices
        if (index < 0 || index >= heroes.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for " + 
                                                "the size of this party!");
        }

        // Adding hero magic
        heroes[index] = hero;
    } // End of addHero()

    /**
     * Remove and return the Hero from the given index
     * 
     * @param index     Index
     * @return          Hero to be removed from the array
     */
    public Hero removeHero(int index) {
        // Check for handling an out of bounds index
        if (index < 0 || index >= heroes.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for " + 
                                                "the size of this party!");
        }

        // Check for handling if there is no hero at the index
        if (heroes[index] == null) {
            throw new IllegalArgumentException("There is no hero that exists at index " +
                                                index + "!");
        }

        // Variable declaration
        Hero removedHero = heroes[index];

        // Remove hero at the given index
        heroes[index] = null;

        return removedHero;
    } // End of removeHero()

    /**
     * Return the hero of the desired index
     * 
     * @param index     Index
     * @return          Hero to be fetched
     */
    public Hero getHero(int index) {
        // Variable declaration
        Hero fetchedHero = heroes[index];

        return fetchedHero;
    } // End of getHero()

    public void gainExperience() {
        
    } // End of gainExperience()
} // End of Party
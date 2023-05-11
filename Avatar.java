/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
/**
 * Class that contains information about the player/avatar
 */
public class Avatar{
    protected static ArrayList<String> inventory; 
    protected static int health;  
    Scanner name = new Scanner(System.in); 
    protected static String location;

    /**
    * Avatar constructor 
    */
    public Avatar(int health, String location){
        this.health = 3; 
        this.location = location;
        this.inventory = new ArrayList<String>(); 
    }

   

    /**
     * Accessor for the player's current inventory. 
     * @return the player's current inventory. 
     */
    public ArrayList<String> getInventory(){
        System.out.println(inventory);
        return inventory;
    }

    /**
     * Accessor for the player's location in the game. 
     * @param location the player's location in the game. 
     * @return the location of the player in the game.
     */
    public String getLocation(String location) {
        System.out.println(location);
        return location;
    }

}
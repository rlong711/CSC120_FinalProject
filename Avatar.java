/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
public class Avatar{
    protected String avatarName; 
    protected static ArrayList<String> inventory; 
    protected static int health;  
    Scanner name = new Scanner(System.in); 
    protected static String location;

    /* Avatar constructor */
    public Avatar(String avatarName, int health, String location){
        this.avatarName = avatarName; 
        this.health = 3; 
        this.location = location;
        this.inventory = new ArrayList<String>(); 
    }

    /**
     * accessor for the name 
     * @param avatarName
     * @return
     */
    public String getName(){
        System.out.println("What is your name?");
        avatarName = name.nextLine();
        return avatarName; 
    }

    public ArrayList<String> getInventory(){
        System.out.println(inventory);
        return inventory;
    }

    public String getLocation(String location) {
        System.out.println(location);
        return location;
    }

}
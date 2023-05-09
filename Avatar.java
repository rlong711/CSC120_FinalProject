/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
public class Avatar{
    protected static ArrayList<String> inventory; 
    protected static int health;  
    Scanner name = new Scanner(System.in); 
    protected static String location;

    /* Avatar constructor */
    public Avatar(int health, String location){
        this.health = 3; 
        this.location = location;
        this.inventory = new ArrayList<String>(); 
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
/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
public class Avatar{
    protected String avatarName; 
    protected ArrayList<String> inventory; 
    protected int health;  
    protected String location;

    /* Avatar constructor */
    public Avatar(String avatarName, int health, String location){
        this.avatarName = avatarName; 
        this.health = 3; 
        this.location = location;
        inventory = new ArrayList<String>(); 
    }

    /**
     * accessor for the name 
     * @param avatarName
     * @return
     */
    public String getname(String avatarName){
        System.out.println(avatarName); 
        return avatarName; 
    }

    public ArrayList<String> getInventory(){
        System.out.println();
        return inventory;
    }

    public String getLocation(String location) {
        System.out.println(location);
        return location;
    }

    public 

}
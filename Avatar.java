/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
public class Avatar{
    String avatarName; 
    ArrayList<String> inventory; 
    int health;  
    String location;

    /* Avatar constructor */
    public Avatar(String avatarName, int health, String location){
        this.avatarName = avatarName; 
        this.health = health; 
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



}
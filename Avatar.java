/**
 * Intitialize/create your person, store how many lives you have, prints gameplay 
 * avatarName = name of the avatar 
 * ArrayList inventory = list of the current inventory the avatar has 
 */
import java.util.*; 
public class Avatar{
    String avatarName; 
    ArrayList<String> inventory; 
    Double health;  


    public Avatar(String avatarName, Double health){
        this.avatarName = avatarName; 
        this.health = health; 
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
        System.out.println()
    }



}

import java.util.*; 
/**
 * This Class runs the game and calls on the other methods of the game from the village, avatar, mine, and introduction class. 
 */
public class Gameplay{
    static Scanner talkMore = new Scanner(System.in);

/**
 * This is the main method that runs the game. 
 * @param args The methods that run the game in order. 
 */
    public static void main(String[] args) {
        Avatar newAvatar = new Avatar(3, "Beach"); 
        Gameplay gameplay = new Gameplay(); 
        Introduction startGame = new Introduction(3, "Beach");
        startGame.initialize();
        Village newVillage = new Village("beach"); 
        newVillage.beachVillage(); 
        System.out.println("Your health level out of 3 is at " + Avatar.health); 
       
    }
       
}

    

       
    


import java.util.*; 
/**
 * Runs the actual game. 
 */
public class Gameplay{


    public static void main(String[] args) {
        Avatar newAvatar = new Avatar(3, "Beach"); 
        Gameplay gameplay = new Gameplay(); 
        Introduction startGame = new Introduction(3, "Beach");
        startGame.initialize();
        Village newVillage = new Village("beach"); 
        newVillage.beachVillage(); 
        



        







    }
    

       
    
}

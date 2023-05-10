
import java.util.*; 
/**
 * Runs the actual game. 
 */
public class Gameplay{
    static Scanner talkMore = new Scanner(System.in);

   




    public static void main(String[] args) {
        Avatar newAvatar = new Avatar(3, "Beach"); 
        Gameplay gameplay = new Gameplay(); 
        Introduction startGame = new Introduction(3, "Beach");
        startGame.initialize();
        Village newVillage = new Village("beach"); 
        newVillage.beachVillage(); 
        System.out.println("Is there anyone else you would like to see? Enter yes or no"); 
        String talkDecision = talkMore.nextLine(); 
        while(talkDecision.equals("yes")){
            newVillage.beachVillage(); 
            System.out.println("Would you like to talk to anyone else? Enter yes or no"); 
            talkDecision = talkMore.nextLine(); 
        }
        newVillage.pathToTreasureBear("Path to Treasure");
        newVillage.pathToTreasureLake(talkDecision);
       
    }
       
}

    

       
    

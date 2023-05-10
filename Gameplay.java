
import java.util.*; 
/**
 * Runs the actual game. 
 */
public class Gameplay{
    static Scanner talkMore = new Scanner(System.in);

   




    public static void main(String[] args) {
        Avatar newAvatar = new Avatar(3, "Beach"); 
        Gameplay gameplay = new Gameplay(); 
        while(Avatar.health >= 1){
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
            System.out.println("Your health level out of 3 is at " + Avatar.health); 
        }
      while(Avatar.health == 0); 
        System.out.println("Looks like you're out of lives... Sucks to suck I guess... Play again to try your luck"); 
       
    }
       
}

    

       
    

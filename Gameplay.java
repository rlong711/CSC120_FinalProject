/**
 * The methods/paths you take as you go down 
 */
import java.util.*; 
/**
 * choices: decision to go left, right, forward, backwards
 * NPC: if there is a character that you come across 
 * artifactname: the artifact/tool you pick up on the way of the challenges
 */
public class Gameplay {
    String choices; 
    boolean NPC; 
    String artifactName; 
    String challengeDescription; 

    public void introduction(){
        System.out.println("Hello" + avatarName + "! You have woken up with a note in your hand on the beach. It tells you that there is a treasure to be found! Do you want to go look for that treasure right now?"); 
        Scanner intro = new Scanner(System.in); 
        System.out.println("Enter yes or no"); 
        String choiceOne = intro.nextLine(); 
        try{
            if(choiceOne == "yes"){
                System.out.println("Great! What's your name?"); 
            if(choiceOne == "no"){
                System.out.println("Too bad! You now fall asleep and die of heat stroke. This is the first life you've lost of three so be careful!"); 
                health -= 1; 
            }
        catch (Exception e){
            System.out.println("Something went wrong! Please either say yes or no to this question or this narrator will get angry")
        }
        
    }
    
}

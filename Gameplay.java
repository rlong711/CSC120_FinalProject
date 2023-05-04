
import java.util.*; 
public class Gameplay {
    String avatarName;  
    Double health; 
    

    public Gameplay(String avatarName, Double health){
        this.avatarName = avatarName; 
        this.health = health; 
    }


    public void introduction(){
        System.out.println("Hello" + this.avatarName + "! You have woken up with a note in your hand on the beach. It tells you that there is a treasure to be found! Do you want to go look for that treasure right now?"); 
        Scanner intro = new Scanner(System.in); 
        System.out.println("Enter yes or no"); 
        String choiceOne = intro.nextLine(); 
        intro.close(); 
        try{
            if(choiceOne == "yes"){
                System.out.println("Great! What's your name?"); 
            }
            if(choiceOne == "no"){
                System.out.println("Too bad! You now fall asleep and die of heat stroke. This is the first life you've lost of three so be careful!"); 
                health -= 1; 
            }
        }
        catch (Exception e){
            System.out.println("Something went wrong! Please either say yes or no to this question or this narrator will get angry");
        }
        
    }

    public void pathOneChoice(){
        System.out.println("We are so glad you decided to go on this adventure."); 
        System.out.println("Now you must chose who you want to go see first. Be careful though... there are dangers hissden around every corner!");
        System.out.println("Who will you decide to go see ... The Blacksmith, The Carpenter, and The Psychic. You can go see all of them, none of them, just one of them, or just two of them."); 
        System.out.println("Be careful though..."); 
        Scanner pathOneChoiceBlacksmith = new Scanner(System.in); 
        System.out.println("Do you want to see The Blacksmith Answer yes or no"); 
        String blacksmithChoice = pathOneChoiceBlacksmith.nextLine(); 
        pathOneChoiceBlacksmith.close(); 
        try{
            if(blacksmithChoice.equals("yes")) {
                System.out.println("Amazing choice! You must now journey to the beach town where you will meet the blacksmith."); 
            }
            if (blacksmithChoice.equals("no")){
                System.out.println("Well I hope you are sure..."); 
            }
        }
        catch (Exception e){
            System.out.println("You did not put in something valid... try again please"); 
        }  
        Scanner pathOneChoiceCarpenter = new Scanner(System.in); 
        System.out.println("Do you want to go see The Carpenter? Type yes or no");
        
        
        
    }

    public static void main(String args[]) {
        Gameplay Raley = new Gameplay("Raley"); 

    }
       
    
}

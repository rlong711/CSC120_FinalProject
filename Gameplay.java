
import java.util.*; 
/**
 * Runs the actual game. 
 */
public class Gameplay {

    Scanner naming = new Scanner(System.in); 
    String Name; 

    public void getName(){
        System.out.println("What is your name?");
        Name = naming.nextLine();
    }


    public static void main(String[] args) {
        Gameplay gameplay = new Gameplay(); 
        gameplay.getName(); 
        

        







    }
    

       
    
}

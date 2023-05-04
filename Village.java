import java.util.*; 
public class Village {
    String location;
    Object npc;
    boolean artifact;
    boolean canTalk;
    Scanner village = new Scanner(System.in);

    /* Village constructor */
    public Village(String villageName) {
        this.location = villageName;
    }

    /* Method to talk to blacksmith */
    public void blacksmith(String villageName, boolean artifact, boolean canTalk) {
        this.location = "Beach Village";
        System.out.println("The blacksmith tells you that she will tell you about the terrain and make you a sword if you go get iron from the mine.");
        System.out.println("Do you want to go get iron to get a sword made? Please enter 'yes' or 'no'.");
        String mineChoice = village.nextLine();
        while(!mineChoice.equals("yes") & !mineChoice.equals("no")){
            System.out.println("Invalid choice. Please type yes or no"); 
            mineChoice = village.nextLine(); 
        }
        if (mineChoice.equals("yes")) {
            System.out.println("Great! You now journey to the mine."); 
            Avatar.location = "mine";
        }
        if (mineChoice.equals("no")) {
            System.out.println("Okay, no sword for you."); 
            
        } 
    }
    
        
    }


    System.out.println("It looks like you decided to go into this village to look for the tresure!"); 
    System.out.println("Who knows if that was a good choice or not... we will see"); 
    System.out.println("You have come across an old man who ")
    }
public class Village{
    
   
}

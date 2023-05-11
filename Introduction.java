import java.util.*; 

/**
 * Class that contains method for the beginning of the game.
 */
public class Introduction extends Avatar {

    static String avatarName;  
    static int health; 
    Scanner intro = new Scanner(System.in); 
    boolean Start;

    /**
     * Constructor for the introduction class. 
     * @param health The health level out of 3 of the player. 
     * @param location The location of the player in the game. 
     */
    public Introduction(int health, String location){
        super(health, location);
        System.out.println("Hello! You have woken up with a note in your hand on the beach. It tells you that there is a treasure to be found! Do you want to go look for that treasure right now?"); 
    } 
    
    /** 
    * Method to initialize the game 
    */
    public void initialize() {
        System.out.println("Enter yes or no"); 
        String choiceOne = intro.nextLine();
        try {
            if (choiceOne.equals("yes")) {
                System.out.println("Great! You now journey into the nearby town."); 
                this.location = "Beach Village";
            }
            if (choiceOne.equals("no")) {
                System.out.println("Too bad! You now fall asleep and die of heat stroke. This is the first life you've lost of three so be careful!"); 
                Avatar.health -= 1; 
            } 
        } finally {
        while(!choiceOne.equals("yes") & !choiceOne.equals("no")){
            System.out.println("Invalid choice. Please type yes or no"); 
            choiceOne = intro.nextLine(); 
        }
    }
    }

    /**
     * Main method for the introduction class/
     * @param args The health of the player and where the player is located in the game. 
     */
    public static void main(String[] args) {
        Introduction startGame = new Introduction(3,"beach");
        startGame.initialize();
    }
}

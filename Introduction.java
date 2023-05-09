import java.util.*; 


public class Introduction extends Avatar {

    static String avatarName;  
    static int health; 
    Scanner intro = new Scanner(System.in); 
    boolean Start;

    /* Introduction constructor */
    public Introduction(int health, String location){
        super(health, location);
        System.out.println("Hello! You have woken up with a note in your hand on the beach. It tells you that there is a treasure to be found! Do you want to go look for that treasure right now?"); 
    } 
    
    /* Method to initialize the game */
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
                health -= 1; 
            } 
        } finally {
        while(!choiceOne.equals("yes") & !choiceOne.equals("no")){
            System.out.println("Invalid choice. Please type yes or no"); 
            choiceOne = intro.nextLine(); 
        }
    }
    }

    public static void main(String[] args) {
        Introduction startGame = new Introduction(3,"beach");
        startGame.initialize();
    }
}

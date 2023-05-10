import java.util.*; 
public class Village {
    String location;
    static Scanner village = new Scanner(System.in);
   

    /* Village constructor */
    public Village(String location) {
        this.location = location;
    }

    /* Method for initial beach village entrance */
    public void beachVillage() {
        System.out.println("You enter the village by the beach and see a busy street. Do you want to talk to some people or continue straight through the village?");
        System.out.println("Please enter 'talk' or 'walk'.");
        String villageAction = village.nextLine();
        if (villageAction.equals("walk")) {
            System.out.println("You choose not to talk to anyone and continue through the village."); 
        } 
        if (villageAction.equals("talk")) {
            System.out.println("Great! You decide the village blacksmith, carpenter, and psychic are probably the best to talk to."); 
            System.out.println("You can talk to one, two, or all of them. Who would you like to talk to? Please enter 'blacksmith', 'carpenter', 'psychic', or 'none'.");
            String beachVillageTalk = village.nextLine(); 
            if (beachVillageTalk.equals("blacksmith")) {
                System.out.println("You choose to talk to the blacksmith and enter the smithy."); 
                Village.blacksmith("Beach Village");
            } 
            if (beachVillageTalk.equals("carpenter")) {
                System.out.println("You choose to talk to the carpenter and enter the wood shop."); 
                Village.carpenter("Beach Village");
            }
            if (beachVillageTalk.equals("psychic")) {
                System.out.println("You choose to talk to the psychic and walk up to her."); 
                Village.psychic("Beach Village");
            }
           if(!beachVillageTalk.equals("blacksmith") & !beachVillageTalk.equals("carpenter") & !beachVillageTalk.equals("psychic") & !beachVillageTalk.equals("none")){
                System.out.println("Invalid choice. Please type blacksmith, carpenter, psychic or none"); 
                villageAction = village.nextLine(); 
            }
        }
        while(!villageAction.equals("talk") & !villageAction.equals("walk")){
            System.out.println("Invalid choice. Please type talk or walk"); 
            villageAction = village.nextLine(); 
        }
    }

    

    /* Method to talk to blacksmith */
    public static void blacksmith(String location) {
        location = "Beach Village";
        System.out.println("The blacksmith tells you that she will tell you about the terrain and make you a sword if you go get iron from the mine.");
        System.out.println("Do you want to go get iron to get a sword made? Please enter 'yes' or 'no'.");
        String goMine = village.nextLine();
        if (goMine.equals("yes")) {
            System.out.println("Great! You now journey to the mine."); 
            Avatar.location = "mine";
            Mine mineChoice = new Mine("Mine", "iron"); 
            mineChoice.getIron();  
            Village.blacksmithSword(); 
        }
        if (goMine.equals("no")) {
            System.out.println("Okay, no sword or information for you. You now exit the smithy."); 
        } 
        while(!goMine.equals("yes") & !goMine.equals("no")){
            System.out.println("Invalid choice. Please type yes or no"); 
            goMine = village.nextLine(); 
        }
        
    }

    

    /* Method to get sword from blacksmith */
    public static void blacksmithSword() {
        if (Avatar.inventory.contains("Iron")) {
            System.out.println("You return to the blacksmith and give her the iron from the mine. She returns to you with a sword in hand.");
            Avatar.inventory.remove("Iron");
            Avatar.inventory.add("sword");
            System.out.println("You now have a sword in your inventory! You say thanks to the blacksmith and leave the smithy");
        } else {
            System.out.println("You do not have the iron needed to make this sword. Looks like you're stuck... good luck to you!"); 
        }
    }

    /* Method to talk to carpenter */
    public static void carpenter(String location) {
        location = "Beach Village";
        System.out.println("The carpenter says the quickest way to the treasure is the by taking the middle path of the ones going out of the village, up the mountain, and down the stream to the lake.");
        System.out.println("The carpenter offers you a raft to ride down the river. Do you want to take the raft? Please enter 'yes' or 'no'.");
        String carpenterChoice = village.nextLine();
        while(!carpenterChoice.equals("yes") & !carpenterChoice.equals("no")){
            System.out.println("Invalid choice. Please type yes or no"); 
            carpenterChoice = village.nextLine(); 
        }
        if (carpenterChoice.equals("yes")) {
            System.out.println("Great! You now have a raft in your inventory. You say thank you to the carpenter and leave their shop."); 
            Avatar.inventory.add("raft");
        }
        if (carpenterChoice.equals("no")) {
            System.out.println("Okay, no raft for you. You now exit the carpenter's shop."); 
        } 
    }

    /* Method to talk to psychic */
    public static void psychic(String location) {
        location = "Beach Village";
        System.out.println("You approach the psychic and she tells you that there is only one path to the treasure, but you will encounter difficulties never before seen.");
        System.out.println("You tell her that is unnecessarily vague, and she tells you that on the path you will encounter a strange beach bear and that the treasure is in a lake...");
        System.out.println("You now exit the psychics house.");
        Avatar.location = "Beach Village";
    }

    public static void pathToTreasureBear(String location){
        location = "Path to Treasure"; 
        System.out.println("Now that you have talked to everyone you wanted to, it is time to journey to the treasure."); 
        System.out.println("As you are walking along the path, you hear a rustling of leaves"); 
        System.out.println("Oh no.... It's a beach bear named Harold!! Do not panic though, you do have a sword right?"); 
        if (Avatar.inventory.contains("sword")){
            System.out.println("Yay you have a sword! You use tha sword to get rid of that beach bear and continue on your journey"); 
        }
        if(!Avatar.inventory.contains("sword")){
            System.out.println("Wow... you had no sword and you stood no chance against that beach bear named Harold..."); 
            System.out.println("You lose a life..."); 
            Avatar.health -= 1; 
            System.out.println("This is how many lives you have left now: " + Avatar.health); 
        }
    }

    public static void pathToTreasureLake(String location){
        location = "Path to Treasure"; 
        System.out.println("Well now that the Harold is gone, you continueon your journey and stumble upon a lake."); 
        System.out.println("You look at this lake and are not sure if the treasure could be in there or not."); 
        System.out.println("HINT: What did the psychic tell you?"); 
        System.out.println("Would you like to look in the lake? Or would you like to continue walking. Enter yes or no to let us know."); 
        String lakeAction = village.nextLine();
        if (lakeAction.equals("yes")){
            System.out.println("Good choice! The psychic told you that the treasure was in a lake, and this is that very lake!"); 
            Village.findTreasure(); 
        }
        if (lakeAction.equals("no")){
            System.out.println("Interesting choice. Anyway... you walk past the lake and are immediately abducted by aliens and lose a life."); 
            Avatar.health -= 1; 
            Village.findTreasure(); 
        }
        while(!lakeAction.equals("yes") & !lakeAction.equals("no")){
            System.out.println("Invalid input. Type yes or no");
            lakeAction = village.nextLine(); 
        }
    }
    
    public static void findTreasure(){
        System.out.println("As you reach the lake you take a breath to look at the water."); 
        System.out.println("Speaking of water... you do have a raft to go across right? You need to get to that treasure quickly because in the distance you hear pirates chasing you who want the treasure for themselves"); 
        System.out.println(Avatar.inventory); 
        if(Avatar.inventory.contains("raft")){
            System.out.println("Thank god you have that raft! The pirates chasing you fade into the distance as you go out further onto the lake"); 
            Village.retrieveTreasure(); 
        }
        if(!Avatar.inventory.contains("raft")){
            System.out.println("Since you don't have a raft, you tried to swim out in the lake to get away from the pirates. Unfortuntely, you were to slow and the pirates take one of your lives."); 
            System.out.println("The pirates decided they did not want the treasure thinking it is fake, so they leave you there on the beach and go back to their ship. You still don't have a raft, so you can not go out to get the treasure and your journey ends here."); 
            Avatar.health -= 1; 
        }
    }

    public static void retrieveTreasure(){
        if (Avatar.health > 0) {
            System.out.println("As you paddle out into the lake, you suddenly see something glittering below the surface. You also see a rope, and you struggle to pull something heavy up."); 
            System.out.println("You open the treasure chest, and you see gold coins, sapphires, emeralds, rubies, golden goblets, gigantic diamonds, gold bars, and beautiful jewelry"); 
            System.out.println("Thanks for playing and come again!"); 
        }
        if(Avatar.health <= 0){
            System.out.println("It looks like you don't have any more lives left. You don't get any treasure... Hope you do better next time"); 
            System.out.println("Thanks for playing and come again!"); 
        }
    }


}
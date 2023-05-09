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
        String villageAction = village.next();
        while(!villageAction.equals("talk") & !villageAction.equals("walk")){
            System.out.println("Invalid choice. Please type talk or walk"); 
            villageAction = village.nextLine(); 
        }
        if (villageAction.equals("walk")) {
            System.out.println("You choose not to talk to anyone and continue through the village."); 
        } 
        if (villageAction.equals("talk")) {
            System.out.println("Great! You decide the village blacksmith, carpenter, and psychic are probably the best to talk to."); 
            System.out.println("You can talk to one, two, or all of them. Who would you like to talk to? Please enter 'blacksmith', 'carpenter', 'psychic', or 'none'.");
            String beachVillageTalk = village.nextLine();
            while(!beachVillageTalk.equals("blacksmith") & !beachVillageTalk.equals("carpenter") & !beachVillageTalk.equals("psychic") & !beachVillageTalk.equals("none")){
                System.out.println("Invalid choice. Please type blacksmith, carpenter, psychic or none"); 
                villageAction = village.nextLine(); 
            }
            if (villageAction.equals("blacksmith")) {
                System.out.println("You choose to talk to the blacksmith and enter the smithy."); 
                Village.blacksmith("Beach Village");
            } 
            if (villageAction.equals("carpenter")) {
                System.out.println("You choose to talk to the carpenter and enter the wood shop."); 
                Village.carpenter("Beach Village");
            }
            if (villageAction.equals("psychic")) {
                System.out.println("You choose to talk to the psychic and walk up to her."); 
                Village.psychic("Beach Village");
            }
        }
    }

    /* Method to talk to blacksmith */
    public static void blacksmith(String location) {
        location = "Beach Village";
        System.out.println("The blacksmith tells you that she will tell you about the terrain and make you a sword if you go get iron from the mine.");
        System.out.println("Do you want to go get iron to get a sword made? Please enter 'yes' or 'no'.");
        String goMine = village.nextLine();
        while(!goMine.equals("yes") & !goMine.equals("no")){
            if (goMine.equals("yes")) {
                System.out.println("Great! You now journey to the mine."); 
                Avatar.location = "mine";
            }
            if (goMine.equals("no")) {
                System.out.println("Okay, no sword or information for you. You now exit the smithy."); 
            } else {
                System.out.println("Invalid choice. Please type yes or no"); 
                goMine = village.nextLine(); 
            }
        }
    }

    /* Method to get sword from blacksmith */
    public static void blacksmithSword() {
        if (Avatar.inventory.contains("iron") && Avatar.location.equals("Beach Village")) {
            System.out.println("You return to the blacksmith and give her the iron from the mine. She returns to you with a sword in hand.");
            Avatar.inventory.remove("iron");
            Avatar.inventory.add("sword");
            System.out.println("You now have a sword in your inventory! You say thanks to the blacksmith and leave the smithy");
        } else {
            System.out.println("You do no have iron and cannot have a sword made!");
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
        System.out.println("You approach the psychic and she tells you that the fastest way to the treasure is by taking the path on the right of the ones going out of the village.");
        System.out.println("She also tells you that on the path you will encounter a strange beach bear...");
        System.out.println("You now exit the psychics house.");
        Avatar.location = "Beach Village";
    }

    
    public static void main(String[] args) {
    
    }


}
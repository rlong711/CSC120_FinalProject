import java.util.*; 
public class Village {
    String location;
    Object npc;
    boolean artifact;
    boolean canTalk;

    /* Village constructor */
    public Village(String villageName, Object npc) {
        this.location = villageName;
        this.npc = npc;
    }

    /* Method to talk to blacksmith */
    public void blacksmith(String villageName, Object npc, boolean artifact, boolean canTalk) {
        if (this.location.equals(villageName)) {
            canTalk = true;
        } else {
            System.out.println("You are not by " + npc + ", you cannot talk to them!");
        }
        if (canTalk = true) {
            System.out.println("The blacksmith tells you that she will tell you about the terrain and make you a sword if you go get iron from the mine.");
            System.out.println("Do you want to go get iron to get a sword made?");
        }
        }
        
    }


    System.out.println("It looks like you decided to go into this village to look for the tresure!"); 
    System.out.println("Who knows if that was a good choice or not... we will see"); 
    System.out.println("You have come across an old man who ")
    }
}

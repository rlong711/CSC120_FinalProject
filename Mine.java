import java.util.*;
/**
 * Class containing methods that have to do with the Mine location in the game. 
 */
public class Mine{
  
    protected String location;
    private ArrayList<String> mineArtifact;
    static Scanner mine = new Scanner(System.in);

    /**
     * Constructor for the mine class. 
     * @param location Where the player currently is. 
     * @param artifact The object/resource that the player is trying to retrieve in the mine. 
     */
    public Mine(String location, String artifact) {
        this.location = "Mine";
        this.mineArtifact = new ArrayList<String>();
    }

    /**
     * Method to add the iron artifact to the list of artifacts in the mine. 
     * @param artifact Method to add iron artifact to mine 
    */
    private void addIron(String artifact) {
        mineArtifact.add("Iron");
    }

    /**
     * Method to remove iron artifact from mine 
     */
    public boolean getIron() {
        mineArtifact.remove("Iron");
        Avatar.inventory.add("Iron");
        System.out.println("You have gotten iron from the mine and it has been added to your inventory.");
        System.out.println("Return to town to have a sword made by the blacksmith");
        System.out.println(Avatar.inventory);
        return true;
    }


    /**
     * Main method for the Mine class. 
     * @param args The location in the game and the artifact being acquired. 
     */
    public static void main(String[] args) {
        Mine mine = new Mine("Mine", "Iron");
        mine.addIron("Iron");
        mine.getIron();
    }

}

import java.util.*;
public class Mine {
  
    protected String location;
    private ArrayList<String> mineArtifact;
    static Scanner mine = new Scanner(System.in);

    /* Mine constructor */
    public Mine(String location, String artifact) {
        this.location = "Mine";
        this.mineArtifact = new ArrayList<String> ();
    }

    /* Method to add iron artifact to mine */
    private void addIron(String artifact) {
        mineArtifact.add("Iron");
    }

    /* Method to remove iron artifact from mine */
    public boolean getIron(Avatar inventory) {
        mineArtifact.remove("Iron");
        inventory.add("Iron");
        System.out.println("You have gotten iron from the mine and it has been added to your inventory.");
        System.out.println("Return to town to have a sword made by the blacksmith");
    }


    public static void main(String[] args) {
        Mine mine = new Mine("Mine", "Iron");
        mine.addIron("Iron");
        mine.getIron("Iron");
    }

}

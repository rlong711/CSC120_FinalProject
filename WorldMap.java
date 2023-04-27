/**
 * Stores all the locations you can go to as string, boolean if the location has challenge/NPC/inventory addition
 * worldName = the name of the world you are adventuring in 
 * locationName = the name of the location on the map 
 * NPC = if a non-playing character is there or not
 * itemName = if get an item at that location or not
 * challenge = if there is a challenge at this location
 */
import java.util.*; 
public class WorldMap{
    String worldName; 
    String locationName; 
    String locationDescription; 
    boolean NPC; 
    boolean itemName; 
    boolean challenge; 
}
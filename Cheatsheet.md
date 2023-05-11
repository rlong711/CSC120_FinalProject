

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

The story starts when you are told you wake up on a beach. You have 3 lives, and if you run out of lives the game terminates and you have to start again. When the game starts, you are asked if you want to look for treasure or not. If you don't want to look for treasure, you lose a life and the game continues anyway. From there you walk to a beach village where there are 3 NPC characters that you can talk to: Blacksmith, Carpenter, and Psychic. You can see all of them, some of them, or none of them. There are consequences to the decision though. 

If the player choses to go to the Blacksmith, they walk to the Blacksmith. This Blacksmith gives them necessary information and sends them to the mines. At the mines, they have to decide wheter or not to take the iron or not. If they decide to take the iron, iron is added to their inventory and they return to the Blacksmith and the Blacksmith akes them a sword. This sword is added to the player inventory. 

If the player choses to go to the Carpenter, the Carpenter asks them if they want a raft or not. If the player says yes, a raft is added to their inventory. If they chose not to take the raft, they continue the game without a raft. 

If the player choses to go to the psychic, the psychic tells you where the treasure is located. 

Once the player has talked to all of the NPC characters they want, they walk out of the village along a path to the treasure. Along this path, a bear attacks them. If they do not have the sword, they lose a life since the bear kills them. As they continue on the path, they see the lake. The player has to decide if they want to go look for the treasure in the lake or continue on the path. If they chose to continue, they are abducted by aliens and lose a life. If they go to the lake, they are safe for the time being. 

Once at the lake, the player must go look for the treasure. If they have a raft, they are able to get to the treasure no probblem. If they don't have a raft, the pirates chasing them (that the player does not know about until this moment) get to them first and the player loses a life. 

Assuming that the player has not used all of their lives, they can retrieve the treasure! 

All of the methods and their actions, sorted by class are listed below:
Avatar Class:
1. getInventory() - returns the Avatar's current inventory
2. getLocation(String location) - returns the Avatar's current location

Mine Class:
1. addIron(String artifact) - allows for the creation of iron as an artifact in the mine
2. getIron() - retrieves iron from the mine, putting it in the Avatar's inventory

Introduction Class:
1. initialize() - begins the game, laying out the premise of the story and begins the Avatar's journey into the village. Includes the first choice the Avatar can make (whether to enter the village in search of treasure or not). If they choose not to, they die of heatstroke and have a life subtracted.

Village Class:
This class holds the majority of the methods for our game
1. beachVillage(String location) - Location is "Beach Village." Avatar enters the village and has the option to either walk through or stop to talk to either the blacksmith, carpenter, or psychic. All these characters will aid in gameplay. 
2. blacksmith(String location) - Location is "Beach Village." Avatar talks to the blacksmith and has the option to go to the mine to retrieve iron to have a sword made. If player decides not to, they exit the smithy. If player decides to, they go to the mine and get the iron which is added to their inventory (using the Mine class).
3. blacksmithSword() - Avatar returns to the blacksmith where the iron is removed from their inventory and a sword is added.
4. talkMoreBlacksmith() - Gives Avatar the ability to decide whether they want to talk to the carpenter or psychic after leaving the smithy or journey on without talking to them.
5. carpenter(String location) - Location is "Beach Village." Avatar talks to the carpenter who offers a raft and player has option to take raft or not. If they take the raft it is added to their inventory, if not they leave the shop.
6. carpenterTalkMore() - Gives Avatar the ability to decide whether they want to talk to the blacksmith or psychic after exiting the carpenter shop or journey on.
7. psychic(String location) - Location is "Beach Village." Avatar approaches the psychic who tells player that that the treasure is in a lake and you will encounter a strange beach bear. Avatar then leaves the psychic.
8. talkMorePsychic() - Gives Avatar the ability to decided whether or not they want to talk to the carpenter or blacksmith after exiting the psychic's house or journey on.
9. pathToTreasureBear(String location) - Location is "Path to Treasure." Lays out the story of the beach bear, Harold, who attacks the Avatar. If the Avatar has a sword in their inventory, they survive. If not, they die, have a life subtracted from their health, and wake up in the village. When they wake up, they are asked if they want to talk to anyone again. If they say no, they have a life subtracted since they will die again on the journey if they have no sword. 
10. pathToTreasureLake(String location) - Location is "Path to Treasure." Avatar arrives at lake and can choose whether they want to go look in the lake or continue past it. If Avatar chooses to look in the lake, they continue on to the findTreasure() method. If Avatar chooses to go past, Avatar gets abducted by aliens and loses a life, getting dropped back off at the same spot.
11. findTreasure() - Avatar reaches the lake where they're told pirates are chasing them. If they have a raft (retrieved from the carpenter), they can get into the lake where danger of pirates passes. If they don't have a raft, they try swimming but the pirates catch you and take a life. The game ends here.
12. retrieveTreasure() - Avatar gets to the middle of the lake where they retrieve the treasure! If they have no more lives, they can't reach the treasure and the game ends.

Gameplay Class:

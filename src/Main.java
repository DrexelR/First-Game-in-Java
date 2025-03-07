import java.util.Scanner;

public class Main {
    public static boolean game_running = false;
    public static int game_width = 160;
    public static void main(String[] args) {

        try    {
            Scanner scanner = new Scanner(System.in);
            StartMenu.loadupMenu(scanner);
            while (game_running) {
                //Contents of game go here
                System.out.println("Game loop reset");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                Player user = new Player(50, 20, 90, 6, 15, 600, scanner, "", 0);
                user.select_player_class();
                Adventure.start(scanner);
                user.level_up_check();
                Tools.promptEndGame(scanner);
            }
        } catch (Exception e) {
            System.out.println("Ending Game with error... bad error...");
        }
    }
}

//Road map
//Ideally we will have enemy text appear on the right of the console in red, hero text on the left in green, general text on the left or middle in white.
//Make the user character and like two or three enemies, maybe more if it doesn't take much.
//I'm thinking you go to a coord, it tells you the lay of the land, gives you options you select with num keys
//coords will be generated in a 5x5 to start, and every time you approach the edge (without actually reaching it)
//for instance, you hit tile 4x3 on your 5x5 start, 2 more rows and columns will be generated
//If this is too hard to accomplish, give it a 15x15 gameboard and call it a day.


//Items
//Make a class for items, includes buy_price, sell_price, amount (if we can), crafting_requirements (takes an array)
//Gotta make a subclass of items for weapons, includes attack speed, bonus strength, parry %
//make a subclass of items for consumables, includes health_recovery, accuracy_buff, strength_buff for now
//Make instances of consumables for health pot, accuracy pot and strength pot

//Encounters
//Should have method for Fighting encounters, Trade encounters, and World event encounters
//Trade encounters might benefit from a class that passes in an array of items for stock, a second array for prices
//Trade encounters should allow the selling of items and the buying of items
//Buying item deducts the item from trader, adds buy_price to coins and adds it to player with item's price deducted from coins
//Traders will have predefined stock for now, but hopefully random in the future. Just to save time man
//World event encounters will be started on every new tile. It leads you through dialogue options that lead either to a random
//event, that's part of the general "world event", or to a trader/fighting encounter. Traders can lead to fights too.
//World events can add/remove stat points, give items/remove items, do damage/heal

//Fighting encounters
//Will be single-opponent fighting for now
//Initiative will naturally be determined by attack speed
//Before fight there should be an "inspect" option for monster that shows their stats
//I want to make a timed loop that ticks every 1/5th of a second
//attack_speed = 200 will have you attack once every tick, anything more than 200 won't count.
//attk_speed will add one tick every -10 pts, shown below
//200 every 1/5th, 190 2/5, 180 3/5, 170 4/5, 160 5/5, 110 10/5, 60 15/5 (3 seconds), 10 4 seconds (20 ticks)
//Anything less than 10 you won't be able to attack.
//Fighting encounters will be automated, but there is a retreat button.
//strength - opponent's defense is hit strength, negate it from opponents health if attk roll successful
//dodgepercent will be a random roll
//dodgepercent can only go from 0 to 99
//dodgepercent * .12 (rounded down) = scrapechance
//Scrapes will be 1/3rd damage (rounded down)
//it'll apply above and below dodgepercent, for instance, 50 dodgepercent would have the scrape threshold at
//rolls 44 to 56
//So the actual fighting will be a tick loop every 0.2 seconds, maybe we do 0.25 if 0.2 is too fast.
//First tick of the fight starts it off, both fighters are already cooking up their attacks.
//There should be a pause button that stops the loop, and a start button that resumes the loop
//Making sure it doesn't break the tick state. That's something we'll likely save in a local variable to the fight
//During the pause function there should be a retreat option that takes 10 ticks to cook up and cancels ur attk tick
//Also during pause there should be a "rummage through bag" option that takes 5 ticks to cook up and cancels your attk tick




//Map Progression
//User will be able to advance forward, backward, left or right one square at a time
//We won't have a preset game board, just coordinates and the stuff that's supposed to be there.
//We'll wanna add resources to the map



//Future ideas
//Pickpocketting traders
//Skillssss?? Runescape????
//We should make the num keys listen for keyboard input instead of taking a scanner input...
//Make a ghetto map
//Fuck it'd be kinda cool if we had a key that prints out the map of the coords or something
//Make Character class, and an "Enemy", "Neutral" and "Hero" and Subclass if necessary
//Larger, spread out map that's not randomly generated
//WASD or click-based (Like RS) movements
//Add combat skills, like strength that adds a 5% bonus to base weapon damage per level
//Martial skill that adds 5% bonus to attack probability added to base weapon stat
//Defense skill that does the obvious
//Toughness skill that impacts health
//Limberness skill affects dodge percent
//then non-combat skills.

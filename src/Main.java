import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character myChar = new Character(50, 20, 90, 6, 15, 600, scanner);
        System.out.print(myChar.health);
    }
    public void promptUser(String[] prompts, String[] responses){
        for (int  i = 0; i < prompts.length-2; i++){
            System.out.println(prompts[i]);
        }
        System.out.print(prompts[prompts.length-1] + ": ");
    }
}

//Road map
//Ideally we will have enemy text appear on the right of the console in red, hero text on the left in green, general text on the left or middle in white.
//Make the user character and like two or three enemies, maybe more if it doesn't take much.
//I'm thinking you go to a coord, it tells you the lay of the land, gives you options you select with num keys


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

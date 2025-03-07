import java.util.Scanner;
public class Adventure {
    public static boolean adventureRunning = false;
    public static void start(Scanner scanner) {
        adventureRunning = true;
        while (adventureRunning) {
            String[] prompt = {"Where would you like to begin?"};
            String[] responses = {"Land of Oil", "Mother Oasis", "Greyish Pale Badlands", "Crimson Brights"};
            int response = Tools.promptUser(prompt, responses, scanner);
            if (response == 1) {
                Tools.leftAlignText("Onward to the Land of Oil then...", true);
                landOfOil(scanner);
            } else if (response == 2) {
                Tools.rightAlignText("Character Strength not strong enough for MOTHER OASIS", true);
            } else if (response == 3) {
                Tools.rightAlignText("Character Agility not quick enough for GREYISH PALE BADLANDS", true);
            } else if (response == 4) {
                Tools.rightAlignText("Character Intellect not smort enough for CRIMSON BRIGHTS", true);
            }
        }
    }
    private static void landOfOil(Scanner scanner) {
        boolean running = true;
        while (running){
            String[] adventurePrompts= {"While walking through the Land of Oil you can't help but notice the stench of it.", "Smells kinda fricking good", "Honestly smells really too good, you might want to turn back now. What do you think? You can go left, right, backward or forward"};
            String[] responses= {"Left", "Right", "Backward", "Forward"};
            int response = Tools.promptUser(adventurePrompts, responses, scanner);
            Tools.middleAlignText("No matter where you go, you're surrounded by the succulent oils of the Land of Oil", true);
            Tools.middleAlignText("You outta just quit the game, really there's nothing here", true);
            Tools.promptEndGame(scanner);
        }
    }

}

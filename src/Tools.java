import java.util.Scanner;
import java.io.IOException;

public class Tools {
    public static void promptUser(String[] prompts, String[] responses, Scanner scanner){
        boolean running = true;
        while (running)    {
            try {
                for (int i = 0; i < prompts.length-1; i++) {
//                    System.out.println(Colors.BLUE + prompts[i] + Colors.RESET);
                    middleAlignText(Colors.BLUE + prompts[i] + Colors.RESET);
                }
                for (int i = 0; i < responses.length; i++) {
//                    System.out.println(Colors.GREEN + (i + 1) + Colors.YELLOW + ": " + responses[i] + Colors.RESET);
                    leftAlignText(Colors.GREEN + (i + 1) + Colors.YELLOW + ": " + responses[i] + Colors.RESET);
                    leftAlignText(responses[i]);
                }
                System.out.println();
                leftAlignText(prompts[prompts.length - 1] + ": ");

                String inputStr = scanner.nextLine();
                if (!inputStr.matches("-?\\d+")) {
                    throw new Exception("Invalid input. Please enter a number.");
                }
                int inputInt = Integer.parseInt(inputStr);
                //Quit game function
                if (inputInt <= 0){
                    System.out.println(Colors.WHITE + "Quit game? Y, N" + Colors.RESET);
                    char response = scanner.next().charAt(0);
                    if (response == 'Y' || response == 'y' || response == 'N' || response == 'n'){
                        if (response == 'Y' || response == 'y') {
                            Main.game_running = false;
                        }
                    } else {
                        throw new Exception();
                    }
                }
                if (inputInt > responses.length){
                    throw new Exception();
                } else running = false;

            }
            catch (Exception e){
                System.out.println("Input must be a valid prompted number");
            }
        }
    }
    public static void leftAlignText(String text){
        int leftPadding = 40;
        System.out.println(" ".repeat(leftPadding) + text);
    }

    public static void middleAlignText(String text){
        System.out.println(" ".repeat(Main.game_width/2) + text);
    }

    public static void rightAlignText(String text){
        System.out.println(" ".repeat(Math.max(0, Main.game_width-text.length())) + text);
    }
}

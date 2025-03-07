import java.util.Scanner;
import java.io.IOException;

public class Tools {
    public static int promptUser(String[] prompts, String[] responses, Scanner scanner){
        boolean running = true;
        int responseInt = -1;
        while (running)    {
            try {
                for (int i = 0; i < prompts.length-1; i++) {
                    middleAlignText(Colors.BLUE + prompts[i] + Colors.RESET, true);
                }
                for (int i = 0; i < responses.length; i++) {
                    leftAlignText(Colors.GREEN + (i + 1) + Colors.YELLOW + ": " + responses[i] + Colors.RESET, true);
                    leftAlignText(responses[i], true);
                }
                System.out.println();
                leftAlignText(prompts[prompts.length - 1] + ": ", false);

                    String inputStr = scanner.nextLine();
                    if (!inputStr.matches("-?\\d+")) {
                        throw new Exception("Invalid input. Please enter a number.");
                    }
                    int inputInt = Integer.parseInt(inputStr);
                    if (inputInt > responses.length){
                        throw new Exception();
                    }
                    //Quit game function
                    if (inputInt <= 0){
                        promptEndGame(scanner);
                        running = false;
                    } else {
                        responseInt = inputInt;
                        running = false;
                    }

            }
            catch (Exception e){
                System.out.println("Input must be a valid prompted number");
            }
        }
        return responseInt;
    }

    public static boolean promptTrueFalse (String prompt, Scanner scanner) {
        boolean returnValue = false;
            while (true) {
                middleAlignText(Colors.BLUE + prompt + Colors.RESET, true);
                leftAlignText("(" + Colors.GREEN + "[Y]" + Colors.RESET + "ES/" + Colors.RED + "[N]" + Colors.RESET + "O : ", false);
                String inputStr = scanner.nextLine();
                if (!inputStr.equals("Y") && !inputStr.equals("y") && !inputStr.equals("N") && !inputStr.equals("n") && !inputStr.equals("0") && !inputStr.equals("1")) {
                    System.out.println("Input must be Y or N OR 1 or 0");
                } else if (inputStr.equals("Y") || inputStr.equals("y") || inputStr.equals("1")) {
                    returnValue = true;
                    return returnValue;
                } else {
                    return returnValue;
                }

            }
    }

    public static void promptEndGame(Scanner scanner) throws Exception {
           //Quit game function
                boolean response = promptTrueFalse("Quit game? Y, N", scanner);
                if (response) {
                    Main.game_running = false;
                }

    }

    public static void leftAlignText(String text, Boolean wrap){
        int leftPadding = 40;
        if (wrap) {
            System.out.println(" ".repeat(leftPadding) + text);
        } else {
            System.out.print(" ".repeat(leftPadding) + text);
        }
    }

    public static void middleAlignText(String text, Boolean wrap){
        if (wrap) {
            System.out.println(" ".repeat(Main.game_width/2) + text);
        } else {
            System.out.print(" ".repeat(Main.game_width/2) + text);
        }
    }

    public static void rightAlignText(String text, Boolean wrap){
        if (wrap) {
            System.out.println(" ".repeat(Math.max(0, Main.game_width-text.length())) + text);
        } else {
            System.out.print(" ".repeat(Math.max(0, Main.game_width-text.length())) + text);
        }
    }
}

import java.util.Scanner;
public class StartMenu {
    public Scanner scanner;
    public static void loadupMenu (Scanner scanner) {
        String loadupPrompt = "Start Game?";
        boolean mainMenuPromptReturn = Tools.promptTrueFalse(loadupPrompt, scanner);
        if (mainMenuPromptReturn) {
            Main.game_running = true;
        }
    }
}

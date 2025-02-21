import java.util.Scanner;

public class Player extends Character {
    public int player_class;

    public Player(int health, int dodgepercent, int attack_accuracy, int attack_strength, int defense, int coins, int player_class, Scanner scanner){
        super( health,  dodgepercent,  attack_accuracy,  attack_strength,  defense,  coins, scanner);
        this.player_class = player_class;
    }

    public void select_player_class(int player_class) {
        if (player_class <= 0){
            Main.promptUser
        }
    }
}
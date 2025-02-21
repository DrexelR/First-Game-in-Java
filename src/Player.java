import java.util.Scanner;

public class Player extends Character {
    public int player_class;
    public int combat_level;
    public int experience;
    public Player(int health, int dodgepercent, int attack_accuracy, int attack_strength, int defense, int coins,  Scanner scanner, int player_class, int combat_level){
        super( health,  dodgepercent,  attack_accuracy,  attack_strength,  defense,  coins, scanner);
        this.player_class = player_class;
        this.combat_level = combat_level;
        int experience = 0;
    }

    public void select_player_class() {
        if (player_class <= 0){
            String[] prompts = new String[] {"What Class do you choose?", "Which number, man?"};
            String[] responses = new String[] {"Warrior", "Rogue", "Knight (Tank)"};
            Tools.promptUser(prompts, responses, scanner);
        }
    }
    //returns int of experience cap for level
    public int calc_next_level() {
        int next_level = combat_level * 100 + 50 * (combat_level - 1);
        int experience_left = next_level - experience;
        System.out.println(experience + "/" + next_level + " experience remaining.");
        return experience_left;
    }
}
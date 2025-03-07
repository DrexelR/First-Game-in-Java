import java.util.Scanner;

public class Player extends Character {
    public String player_class;
    public int combat_level = 1;
    public int experience;
    public Player(int health, int dodgepercent, int attack_accuracy, int attack_strength, int defense, int coins,  Scanner scanner, String player_class, int experience){
        super( health,  dodgepercent,  attack_accuracy,  attack_strength,  defense,  coins, scanner);
        this.player_class = player_class;
        this.experience = experience;
    }


    public void select_player_class() {
        if (player_class.isEmpty()){
            String[] prompts = new String[] {"What Class do you choose?", "Which number, man?"};
            String[] responses = new String[] {"Warrior", "Rogue", "Knight (Tank)"};
            int classNumber = Tools.promptUser(prompts, responses, scanner);
            if (classNumber <= 0) {
                return;
            }
            this.player_class = responses[classNumber - 1];
            System.out.println("Player class is now " + this.player_class);
        } else {
            System.out.println("RAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA Player class is currently " + this.player_class);
        }
    }
    //returns int of experience cap for level
    public int xp_check() {
        int next_level = combat_level * combat_level * 100;
        int experience_left = next_level - experience;
        System.out.println(experience + "/" + next_level + " experience remaining.");
        return Math.max(experience_left, 0);
    }
    public void level_up_check(){
        int xp_check = xp_check();
        if (xp_check <= 0) {
           combat_level++;
           experience = (experience - xp_check);
        }
    }
}
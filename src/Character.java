import java.util.Scanner;

public class Character {
    public Scanner scanner;
    public int health;
    public int dodgepercent;
    public int attack_accuracy;
    public int attack_strength;
    public int defense;
    public int coins;
    public Character (int health, int dodge_percent, int attack_accuracy, int attack_strength, int defense, int coins, Scanner scanner){
        this.health = health;
        this.dodgepercent = dodge_percent;
        this.attack_accuracy = attack_accuracy;
        this.attack_strength = attack_strength;
        this.defense = defense;
        this.coins = coins;
        this.scanner = scanner;
    }
}

//Classes for now should include coins, attack accuracy, attk strength, defense, dodge % and health.
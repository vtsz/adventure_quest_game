import java.util.*;

public class Player {

    private static int health = 100;
    private static int maxHealth = 100;
    private static int damage = 10;
    private static int money = 0;

    public static int getHealth() {
        return health;
    }

    public static int getGold() {
        return money;
    }

    public static void addGold(int gold) {
        money += gold;
    }

    public static void attack(Monster monster) {
        System.out.println("You attacked the " + monster.getName() + " for " +  damage + " damage!");
        monster.reduceHealth(damage);
    }

    public static void specialAttack(Monster monster) {
        int finalDamage = damage*2;
        System.out.println("You did a special attack and attacked the " + monster.getName() + " for " +  finalDamage + " damage!");
        monster.reduceHealth(finalDamage);
    }

    public static void reduceHealth(int damage) {
        health -= damage;
    }

    public static void playTurn(Monster monster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player health: " + Player.getHealth());
        System.out.println(monster.getName() + " health: " + monster.getHealth());
        System.out.println("Type 1 to attack");

        int input = scanner.nextInt();
        if(input==1) {
            Random random = new Random();
            int i = random.nextInt(2);
            if(i==0) {
                attack(monster);
            }
            else {
                specialAttack(monster);
            }
        }

        System.out.println("Player health: " + Player.getHealth());
        System.out.println(monster.getName() + " health: " + monster.getHealth());
    }

    public static void winFight(Monster monster) {
        System.out.println("You're victorious!");
        Player.addGold(monster.getGold());
        System.out.println(monster.getGold() + " gold has been added to your total! You now have " + Player.getGold() + " gold.");
    }

    public static void maxHeal() {
        health = maxHealth;
    }

    public static void die() {
        System.out.println("You died.");
        System.out.println("You have been returned to battleon.");
        Player.maxHeal();
    }

    public static void checkStats() {
        System.out.println("Your stats are: ");
        System.out.println("HP: " + health + "/" + maxHealth);
        System.out.println("Damage: " + damage);
        System.out.println("Gold: " + money);
    }




}

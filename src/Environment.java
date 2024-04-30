import java.util.*;

public class Environment {

    public static void main(String[] args) {
        battleonEnvironment();
    }

    public static void battleonEnvironment() {
        Scanner scanner = new Scanner(System.in);
        GameEngine engine = new GameEngine();
        while(true) {
            System.out.println("Location: Battleon");
            System.out.println("Type 1 to battle monsters!");
            System.out.println("Type 2 to visit the shop.");
            System.out.println("Type 3 to drink from the fountain.");
            System.out.println("Type 4 to see stats");
            int input = scanner.nextInt();
            switch(input) {
                case 1:
                    System.out.println("You face a Frogzard!");
                    Frogzard Frogzard = new Frogzard(100, "Frogzard", 10, 20);
                    engine.fight(Frogzard);
                    break;
                case 2:
                    battleonShop battleonShop = new battleonShop();
                    battleonShop.visit();
                    break;
                case 3:
                    Player.maxHeal();
                    System.out.println("The water replenishes all your health");
                    break;
                case 4:
                    Player.checkStats();
                    break;
            }

        }
    }



}

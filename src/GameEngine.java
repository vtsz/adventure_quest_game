public class GameEngine {

    public static void fight(Monster monster) {
        while(true) {
            System.out.println("<-- It's your turn! -->");
            Player.playTurn(monster);
            if(monster.getHealth() <= 0) {
                Player.winFight(monster);
                break;
            }
            System.out.println("<-- It's " + monster.getName() + "'s turn! -->");
            monster.playTurn();
            if(Player.getHealth() <= 0) {
                Player.die();
                break;
            }
        }
    }

}

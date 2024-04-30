import java.util.Random;

public class Frogzard extends Monster {

    public Frogzard(int health, String name, int damage, int gold) {
        super(health, name, damage, gold);
    }

    public void playTurn() {
        Random random = new Random();
        int i = random.nextInt(2);
        if(i==0) {
            attack();
        }
        else {
            specialAttack();
        }
    }

    public void specialAttack() {
        int damage = getDamage()*2;
        System.out.println(getName() + " casts Razor Spitter " + damage + " damage!");
        Player.reduceHealth(damage);
    }



}

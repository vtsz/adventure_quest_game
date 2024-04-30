public abstract class Monster {

    private int health;
    private String name;
    private int damage;
    private int gold;

    public Monster(int health, String name, int damage, int gold) {
        this.health = health;
        this.name = name;
        this.damage = damage;
        this.gold = gold;
    }

    public String getName() {
        return this.name;
    }

    public int getGold() {
        return this.gold;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void attack() {
        System.out.println(this.name + " attacks for " + this.damage + " damage!");
        Player.reduceHealth(this.damage);
    }

    public void playTurn() {
    }

    public void reduceHealth(int damage) {
        this.health -= damage;
    }



}

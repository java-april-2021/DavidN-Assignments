public class Human{
    protected int strength;
    protected int stealth;
    protected int dexterity;
    protected int health;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.dexterity = 3;
        this.health = 100;
    }

    public void attack(Human target){
        target.health -= this.strength;
    }
}
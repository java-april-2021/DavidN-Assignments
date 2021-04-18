public class Ninja extends Human{
    public Ninja(){
        this.strength = 3;
        this.intelligence = 3;
        this.health = 100;
        this.stealth = 10;
    }
    public void steal(Human target){
        target.health -=  this.stealth;
        this.health += this.stealth;
    }
    public void runAway(){
        this.health -= 10;
    }
}
public class Samurai extends Human{
    protected static int samuraicount;
    public Samurai(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 200;
        Samurai.samuraicount += 1;
    }
    public void deathBlow(Human target){
        target.health = 0;
        this.health -= this.health / 2;
    }
    public void meditate(){
        this.health += this.health / 2;
    }

    public static int howMany(){
        return Samurai.samuraicount;
    }
}
public class HumanTest{
    public static void main(String[] args){
        Human david = new Human();
        Human xiff = new Human();
        david.attack(xiff);
        System.out.println(xiff.health);

        Ninja pizzy = new Ninja();
        Samurai nadia = new Samurai();
        Wizard whooper = new Wizard();

        pizzy.steal(xiff);
        pizzy.runAway();
        System.out.println(pizzy.health);
        System.out.println(xiff.health);

        nadia.deathBlow(david);
        System.out.println(nadia.health);
        System.out.println(david.health);
        nadia.meditate();
        System.out.println(nadia.health);
        System.out.println(nadia.howMany());

        whooper.heal(david);
        System.out.println(david.health);
        whooper.fireball(xiff);
        System.out.println(xiff.health);

    }
}
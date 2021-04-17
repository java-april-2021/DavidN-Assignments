public class Bat extends Mammal{
    public Bat(){
        this.setEnergy(300);
    }

    public void fly(){
        System.out.println("SCREEEE! The bat takes off and loses 50 energy");
        this.spendEnergy(50);
    }

    public void eatHumans(){
        System.out.println("OM NOM NOM! AHHHHHH! The bat has eaten a person and gained 25 energy");
        this.gainEnergy(25);
    }

    public void attackTown(){
        System.out.println("BLEGHHHHHH SCREE FWOOOOSH SIZZLE SIZZLE! The bat has destroyed a town and lost 100 energy.");
        this.spendEnergy(100);
    }

}
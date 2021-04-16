public class Gorilla extends Mammal{

    public void throwSomething(){
        this.spendEnergy(5);
        System.out.println("The gorrilla throws something! It loses 5 energy.");
    }

    public void eatBananas(){
        this.gainEnergy(10);
        System.out.println("The gorilla has eaten some bannanas and gained 10 energy!");
    }

    public void climb(){
        this.spendEnergy(10);;
        System.out.println("The gorilla climbs and loses 10 energy.");
    }
}
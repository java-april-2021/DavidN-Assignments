public class HumanTest{
    public static void main(String[] args){
        Human david = new Human();
        Human jiff = new Human();
        david.attack(jiff);
        System.out.println(jiff.health);
    }
}
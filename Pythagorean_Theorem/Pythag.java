import java.lang.Math;

public class Pythag{
    public double calcHypotenuse(int legA, int legB){
        double h = Math.sqrt(legA * legA + legB * legB);
        return h;
    } 
}
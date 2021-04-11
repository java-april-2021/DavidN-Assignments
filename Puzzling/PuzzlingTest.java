import java.util.Arrays;

public class PuzzlingTest{
    public static void main(String[] args){
        PuzzleJava test = new PuzzleJava();
        System.out.println(test.greaterTen());
        System.out.println(test.greaterNames());
        test.alphabet();
        System.out.println(test.randArr());
        test.randArrSort();
        System.out.println(test.randStr());
        System.out.println(Arrays.toString(test.tenStr()));
    }
}
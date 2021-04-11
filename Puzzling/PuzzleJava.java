import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{

    public static ArrayList<Integer> greaterTen(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i : arr){
            if(i > 10){
                arrList.add(i);
            }
        }
        return arrList;
    }
    public static ArrayList<String> greaterNames(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa"); 
        Collections.shuffle(arr);
        System.out.print(arr);
        System.out.println();
        ArrayList<String> arrList = new ArrayList<String>();
        for(String str : arr){
            if(str.length() > 5){
                arrList.add(str);
            }
        }
        return arrList;
    }
    public static void alphabet(){
        ArrayList<String> arr = new ArrayList<String>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            arr.add(Character.toString(a));
            a++;
        }
        Collections.shuffle(arr);
        System.out.println(arr.get(arr.size() - 1));
        if(arr.get(0).equals("a") || arr.get(0).equals("e")  || arr.get(0).equals("i")  || arr.get(0).equals("o")  || arr.get(0).equals("u") ){
            System.out.println("First letter is a vowel");
        }
    }

    public static ArrayList<Integer> randArr(){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            Integer rand = r.nextInt(100 - 55) + 55;
            arrList.add(rand);
        }
        return arrList;
    }

    public static void randArrSort(){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random r = new Random();
        int max = -1000000000;
        int min = 1000000000;
        for(int i = 0; i < 10; i++){
            Integer rand = r.nextInt(100 - 55) + 55;
            arrList.add(rand);
        }
        Collections.sort(arrList);
        System.out.println(arrList);
        for(Integer i : arrList){
            if(Integer.compare(i, max) > 0){
                max = i;
            }
            if(Integer.compare(i, min) < 0){
                min = i;
            }
        }
        System.out.println("Minimum is: " + Integer.toString(min));
        System.out.println("Maximum is: " + Integer.toString(max));
    }
    public static String randStr(){
        ArrayList<String> arr = new ArrayList<String>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            arr.add(Character.toString(a));
            a++;
        }
        String retstr = "";
        for(int i = 0; i < 5; i++){
            Collections.shuffle(arr);
            retstr += arr.get(0);

        }
        return retstr;
    }

    public static String[] tenStr(){
        String[] arr = {randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),};
        return arr;

    }
}
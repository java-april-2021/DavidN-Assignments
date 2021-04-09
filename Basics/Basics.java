import java.util.Arrays;

public class Basics{
    public static void main(String[] args){
        int[] tester = {1,2,3,4};
        int[] tester2 = {1,2,3,-10,-50,-2312,0};
        int[] tester3 = {1,2,10,12,50};
        Basics.oneAndUp();
        System.out.println();
        Basics.oneAndUpOdd();
        System.out.println();
        Basics.oneAndUpSum();
        Basics.arrIter(tester);
        System.out.println();
        Basics.arrMax(tester2);
        System.out.println();
        Basics.arrAvg(tester);
        System.out.println();
        Basics.arrGreater(tester, 2);
        System.out.println();
        Basics.arrSqr(tester);
        System.out.println();
        System.out.print(Arrays.toString(Basics.oneAndUpOddArr()));
        System.out.println();
        System.out.print(Arrays.toString(Basics.arrElim(tester2)));
        System.out.println();
        System.out.print(Arrays.toString(Basics.maxMinAvg(tester)));
        System.out.println();
        System.out.print(Arrays.toString(Basics.shift(tester3)));
    }
    public static void oneAndUp(){
        for(int i = 0; i < 256; i++){
            System.out.print(i + " ");
        }
        return;
    }
    public static void oneAndUpOdd(){
        for(int i = 1; i < 256; i+=2){
            System.out.print(i + " ");
        }
        return;
    }
    public static void oneAndUpSum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
        return;
    }
    public static void arrIter(int[] arr){
        for(int i: arr){
            System.out.print(i);
            System.out.println();
        }
    }
    public static void arrMax(int[] arr){
        int max = -1000000000;
        for(int i: arr){
            if(i > max){
                max = i;
            }
        }
        System.out.print(max);
    }
    public static void arrAvg(int[] arr){
        float avg = 0;
        for(int i: arr){
            avg += i;
        }
        avg = avg / arr.length;
        System.out.print(avg);
    }
    public static void arrGreater(int[] arr, int y){
        int sum = 0;
        for(int i: arr){
            if(i > y){
                sum++;
            }
        }
        System.out.print(sum);
    }
    public static int[] arrSqr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.print(Arrays.toString(arr));
        return arr;
    }
    public static int[] oneAndUpOddArr(){
        int[] arr = new int[129];
        int odds = 1;
        for(int i = 1; odds < 256; i++){
            arr[i] = odds;
            odds+=2;
        }
        return arr;
    }
    public static int[] arrElim(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public static float[] maxMinAvg(int[] arr){
        float avg = 0;
        int max = -1000000000;
        int min = 1000000000;
        for(int i: arr){
            avg += i;
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        avg = avg / arr.length;
        float[] arrret = new float[3];
        arrret[0] = max;
        arrret[1] = min;
        arrret[2] = avg;
        return arrret;
        
    }
    public static int[] shift(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = 0;
                return arr;
            }
            else{
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}
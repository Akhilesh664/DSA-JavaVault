package Top_Tech_Inteview;

import java.util.Arrays;

public class SecondLargestFinder {

    // 1 Way.
//    public static void main(String[] args) {
//        int[] arr = {2,4,6,3,1,4,7,2,3,10,6};
//        int firstmax = Integer.MIN_VALUE;
//        int secmax = Integer.MIN_VALUE;
//
//        for (int n : arr){
//            if(n > firstmax){
//                secmax = firstmax;
//                firstmax = n;
//            } else if (n > secmax && n != firstmax) {
//                secmax = n;
//            }
//        }
//        System.out.println("Second max: "+secmax);
//    }



    // 2 Way.
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99};
        Arrays.sort(arr);
        int n = arr.length;
        int second = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                second = arr[i];
                break;
            }
        }
        if (second == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + second);
        }
    }

}

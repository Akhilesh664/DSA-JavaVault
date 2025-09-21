package Top_Tech_Inteview;

import java.util.Arrays;

public class MissingNumberFinder {

    // 1 Way.
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6};
        int n = 6; // Range is 1 to 6
        int sum = 0;
        int expectedSum = n * (n + 1) / 2;

        for(int num : arr){
            sum += num;
        }
        System.out.println("Missing Number: "+(expectedSum-sum));
    }


    // 2 Way.
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 5, 6};
//        Arrays.sort(arr);
//        int missing = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i + 1) {
//                missing = i + 1;
//                break;
//            }
//        }
//        System.out.println("Missing number: " + missing);
//    }

}

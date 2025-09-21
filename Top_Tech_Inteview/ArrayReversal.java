package Top_Tech_Inteview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReversal {

    // 1 Way.
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        int i = 0;
//        int j = arr.length-1;
//        while(i < j){
//            swapingElements(arr, i, j);
//            i++;
//            j--;
//        }
//        for(int num : arr){
//            System.out.print(num+" ");
//        }
//    }
//    public static void swapingElements(int[] arr, int x, int y){
//        int temp = arr[x];
//        arr[x] = arr[y];
//        arr[y] = temp;
//    }


    // 2 Way.
//    public static void main(String[] args) {
//        Integer[] arr = {1,2,3,4,5,6};
//        List<Integer> list = Arrays.asList(arr);
//        Collections.reverse(list);
//        System.out.println("Reversed array: "+ Arrays.toString(arr));
//    }


    // 3 Way.
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] rev = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rev[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed array: "+ Arrays.toString(rev));
    }

}

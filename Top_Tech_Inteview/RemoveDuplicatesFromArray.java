package Top_Tech_Inteview;

import java.util.*;

public class RemoveDuplicatesFromArray {

    // 1 Way.
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 2, 6, 1, 8, 8, 4};
//        Set<Integer> set = new LinkedHashSet<>();
//        for(int n : arr){
//            set.add(n);
//        }
//        System.out.println(set);
//    }


    // 2 Way.
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 6, 1, 8, 8, 4};
        Arrays.sort(arr);
        int index = 1;
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] != arr[i-1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = 0; i<index; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

package Top_Tech_Inteview;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class CommonElementsFinder {

    // 1 Way.
//    public static void main(String[] args) {
//
//        Integer[] arr1 = {1,2,3,4,5};
//        Integer[] arr2 = {3,4,5,6,7};
//
//        Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
//        Set<Integer> commonElements = new HashSet<>();
//
//        for(int n : arr2){
//            if(set.contains(n)){
//                commonElements.add(n);
//            }
//        }
//        System.out.println("CommonElements: "+commonElements);
//    }


    // 2 Way.
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {3,4,5,6,7};

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // inputting all value from arr1
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            if (union.contains(num)) {
                intersection.add(num);
            }
            union.add(num);
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

}

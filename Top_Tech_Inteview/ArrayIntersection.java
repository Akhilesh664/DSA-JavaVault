package Top_Tech_Inteview;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayIntersection {

    // 1 Way.
//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set1 = new HashSet<>();
//        for (int n : nums1) set1.add(n);
//
//        Set<Integer> result = new HashSet<>();
//        for (int n : nums2)
//            if (set1.contains(n))
//                result.add(n);
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public static void main(String[] args) {
//        int[] result = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
//        System.out.println(Arrays.toString(result)); // Output: [2]
//    }


    // 2 Way.
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {3, 4, 5, 6, 7};
//
//        // Convert first array to a HashSet
//        Set<Integer> set1 = new HashSet<>();
//        for (int num : arr1) {
//            set1.add(num);
//        }
//
//        // Find intersection
//        Set<Integer> intersection = new HashSet<>();
//        for (int num : arr2) {
//            if (set1.contains(num)) {
//                intersection.add(num);
//            }
//        }
//
//        // Print result
//        System.out.println("Intersection: " + intersection);
//    }


    // 3 Way.
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        List<Integer> intersection = Arrays.stream(arr1)
                .filter(set2::contains)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Intersection: " + intersection);
    }



}

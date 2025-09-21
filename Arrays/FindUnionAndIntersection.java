package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindUnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,2,3,6,7,8};
        int[] arr2 = {4,2,1,2,9,3,2,0};

        findUnionAndIntersection(arr1,arr2);

    }

    public static void findUnionAndIntersection(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // inputting all value from arr1
        for (int num : arr1){
            union.add(num);
        }
        for (int num : arr2) {
            if (union.contains(num)){
                intersection.add(num);
            }
            union.add(num);
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

}

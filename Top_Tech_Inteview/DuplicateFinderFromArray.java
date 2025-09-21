package Top_Tech_Inteview;

import java.util.*;

public class DuplicateFinderFromArray {

    // 1 Way.
//    public static void main(String[] args) {
//
//        int[] arr = {8, 2, 5, 3, 1, 9, 8, 2, 9};
//        HashMap<Integer, Integer> hmap = new HashMap<>();
//        ArrayList<Integer> duplicates = new ArrayList<>();
//
//        for (int n : arr){
//            hmap.put(n, hmap.getOrDefault(n, 0)+1);
//        }
//
//        for(Map.Entry<Integer, Integer> entry: hmap.entrySet()){
//            if(entry.getValue() > 1){
//                duplicates.add(entry.getKey());
//            }
//        }
//        System.out.println(duplicates);
//        System.out.println(hmap);
//
//    }



    // 2 Way.
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 1, 9, 8, 2, 9};
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr){
            // add() returns false if element already exists.
            if(!seen.add(num)){
                // storing it in duplicate list
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }

}


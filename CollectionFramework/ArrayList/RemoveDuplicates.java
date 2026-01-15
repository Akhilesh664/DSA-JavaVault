package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // 1st Way : Using for loop
//        ArrayList<Integer> list =
//                new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99, 99));
//        ArrayList<Integer> result = new ArrayList<>();
//        for (Integer num : list) {
//            if (!result.contains(num)) {
//                result.add(num);
//            }
//        }
//        System.out.println(result);



        // 2nd Way : Using Stream
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99, 99));
//        List<Integer> uniqueList =
//                list.stream().distinct().collect(Collectors.toList());
//        System.out.println(uniqueList);



        // 3rd Way : Using LinkedHashSet
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99, 99));
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("ArrayList after removing duplicates: "+list);
    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99, 99));
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("ArrayList after removing duplicates: "+list);
    }
}

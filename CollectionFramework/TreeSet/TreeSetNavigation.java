package CollectionFramework.TreeSet;

import java.util.*;

public class TreeSetNavigation {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        int search = 25;
        System.out.println("Lower than "+search+": "+numbers.lower(search));
        System.out.println("Higher than "+search+": "+numbers.higher(search));
    }
}

package CollectionFramework.TreeSet;

// 💡 TreeSet stores unique elements in sorted order using a Red-Black Tree, providing O(log n) performance for insertions, deletions, and lookups.

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(40, 10, 30, 50, 20));

        System.out.println("Sorted Numbers: " + numbers);
    }

}

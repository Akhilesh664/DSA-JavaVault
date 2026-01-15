package CollectionFramework.LinkedHashSet;
// 💡 LinkedHashSet maintains insertion order while preventing duplicates, offering O(1) time complexity for basic operations.

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        String[] names = {"Akhilesh", "John", "Akhilesh", "Sam", "John", "Mark"};

        Set<String> orderedUniqueNames = new LinkedHashSet<>(Arrays.asList(names));

        System.out.println("Ordered Unique Names: " + orderedUniqueNames);
    }
}

package LinkedHashMap;

//💡 LinkedHashMap (Maintains Insertion Order) maintains the order of insertion while providing O(1) operations.

import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> cache = new LinkedHashMap<>(5, 0.75f, true);

        cache.put("A", "Apple");
        cache.put("B", "Banana");
        cache.put("C", "Cherry");
        cache.put("D", "Dates");
        cache.put("E", "Elderberry");

        System.out.println("Cache before access: " + cache);

        // Access 'B' to make it recently used
        cache.get("B");

        // Adding another entry will remove the least recently used (A)
        cache.put("F", "Fig");

        System.out.println("Cache after adding F: " + cache);

    }

}

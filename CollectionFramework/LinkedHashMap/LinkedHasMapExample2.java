package CollectionFramework.LinkedHashMap;

import java.util.*;

public class LinkedHasMapExample2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        products.put("Laptop", 75000.0);
        products.put("Phone", 50000.0);
        products.put("Tablet", 30000.0);
        products.put("Headphones", 5000.0);

        System.out.println("Original Order: " + products);

        // Sorting by values
        products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " ->₹" + entry.getValue()));

    }
}

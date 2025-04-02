package Java_8;

//💡 Stream API: (🔹 Processing Collections Easily) allows you to process collections (like lists) efficiently without modifying the original collection.
//💡 Uses: The Streams API enables functional-style operations on collections, such as filtering, mapping, and reducing.-
// -In a hotel booking system, you can quickly filter available rooms like this.

import java.util.*;

public class StreamApiExample_4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList(); // Or [collect.(Collectors.toList());]

        System.out.println("Even Numbers: "+evenNumbers);
    }
}

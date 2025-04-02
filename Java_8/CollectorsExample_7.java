package Java_8;

//💡 Collectors: (🔹 Collecting Stream Results) are used to convert stream results into lists, sets, or maps.
//💡 Uses: Collectors provide advanced operations like grouping and summarizing data.
// In a student grading system, you can group students by grades efficiently

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample_7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "Java", "C++");

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());

        System.out.println("Unique Names: "+uniqueNames);

    }
}

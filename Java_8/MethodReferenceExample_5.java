package Java_8;

//💡 Method References: (🔹 Shorter Lambda Expressions) provide a way to reference methods using :: (double colon) instead of writing lambda expressions.
//💡 Uses: Method references provide a concise way to refer to existing methods. In a file processing system, instead of using a -
// -lambda like list.forEach(file -> System.out.println(file)), you can directly use

import java.util.*;

public class MethodReferenceExample_5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akhilesh", "Ravi", "Priya", "Amit");

        // Method References are a shortcut for calling methods directly inside a lambda.
        names.forEach(System.out::println);
    }
}

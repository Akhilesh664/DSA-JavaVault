package Java_8;

//💡 Optional: (🔹 Avoiding NullPointerException) is a container that prevents NullPointerException by handling null values safely.
//💡 Uses: Optional prevents NullPointerException by providing a safe way to handle missing values.
//  -In a customer management system, instead of checking for null, you can use

import java.util.Optional;

public class OptionalExample_6 {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null); // or [if i write (String) which is not null then print values will be String.]

        System.out.println(name.orElse("Default Name"));

    }
}

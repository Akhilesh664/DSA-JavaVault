package Top_Tech_Inteview;

import java.util.*;

public class CollectionConverter {

    public static void main(String[] args) {

        // List with duplicates
        List<String> names = new ArrayList<>();
        names.add("aman");
        names.add("bob");
        names.add("aman"); // duplicate
        names.add("danish");
        System.out.println("Original List: "+names);

        // Convert List to Set
        Set<String> namesSet = new LinkedHashSet<>(names);
        System.out.println("After List to Set conversion: "+namesSet);

        // Convert Set to List
        List<String> uniqueNameList = new ArrayList<>(namesSet);
        System.out.println("After Set to List Conversion: "+uniqueNameList);

    }
}

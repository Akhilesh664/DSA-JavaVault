package CollectionFramework.HashMap;

import java.util.*;

class Employee {
    int id;
    String name;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals() to compare based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;            // Line 1: Same object reference
        if (obj == null || getClass() != obj.getClass()) return false; // Line 2: Null or different class check
        Employee other = (Employee) obj;         // Line 3: Typecast to Employee
        return this.id == other.id && this.name.equals(other.name); // Line 4: Compare fields
    }

    // Overriding hashCode() to match equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);           // Line 5: Generates hash based on id and name
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class HashMapCustomKeyExample {

    public static void main(String[] args) {

        // Step 1: Create a HashMap with Employee as key
        Map<Employee, String> map = new HashMap<>();

        // Step 2: Create two Employee objects with same data
        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(101, "John"); // same id & name as e1

        // Step 3: Put both objects into HashMap
        map.put(e1, "Developer");   // HashMap calls e1.hashCode() to find bucket
        map.put(e2, "Manager");     // HashMap calls e2.hashCode(), finds same bucket, then equals()

        // Step 4: Check map size and values
        System.out.println("Map size: " + map.size()); // Output: 1
        System.out.println("Value for e1: " + map.get(e1)); // Output: Manager
        System.out.println("Value for e2: " + map.get(e2)); // Output: Manager

        // Step 5: Print all entries
        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

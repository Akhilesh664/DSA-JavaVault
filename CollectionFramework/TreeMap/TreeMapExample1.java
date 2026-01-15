package CollectionFramework.TreeMap;

//💡 TreeMap (Sorted Key-Value Storage) maintains the keys in sorted order (O(log n) operations).

import java.util.*;

public class TreeMapExample1 {

    public static void main(String[] args) {

        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(103, "Amit");
        employeeMap.put(101, "Akhilesh");
        employeeMap.put(105, "Ravi");
        employeeMap.put(102, "Priya");

        System.out.println("Sorted Employees by ID: " + employeeMap);

    }
}

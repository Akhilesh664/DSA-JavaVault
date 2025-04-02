package TreeMap;

import java.util.*;

public class TreeMapExample2 {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Low");
        treeMap.put(20, "Medium");
        treeMap.put(30, "High");

        int givenKey = 15;
        Integer nextHigherKey = treeMap.higherKey(givenKey);

        System.out.println("Next highest key after " + givenKey + ": " + nextHigherKey);
    }

}

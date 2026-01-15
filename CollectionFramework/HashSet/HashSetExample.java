package CollectionFramework.HashSet;

//💡 HashSet is an unordered collection that does not allow duplicate values and provides constant-time
//💡 performance (O(1)) for operations like add, remove, and contains.

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 50, 20, 60, 30};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num : numbers){
            uniqueNumbers.add(num);
        }

        System.out.println("Unique Number: "+uniqueNumbers);
    }
}

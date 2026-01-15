package CollectionFramework.Vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class MaxInVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(100, 45, 90, 120, 80));
        int max = Collections.max(v);
        System.out.println("Max number from vector: "+max);
    }
}

package CollectionFramework.LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int middleIndex = ll.size()/2;
        System.out.println(middleIndex);
        System.out.println("Middle element: "+ll.get(middleIndex));
    }
}

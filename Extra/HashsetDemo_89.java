package Extra;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo_89 {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi");
        set.add("bob");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


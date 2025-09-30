package Extra;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo_90 {
    public static void main(String[] args) {
        LinkedHashSet<String> al = new LinkedHashSet<String>();

        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi");
        al.add("Technolamror");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

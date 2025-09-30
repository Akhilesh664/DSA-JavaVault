package Extra;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo_87 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("bob");
        ll.add("tom");
        ll.add("jerry");
        ll.add("ram");
        System.out.println(ll);
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

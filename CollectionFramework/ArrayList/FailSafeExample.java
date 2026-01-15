package CollectionFramework.ArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String>  list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            list.remove("A"); // it will not throw ConcurrentModificationException as it uses CopyOnWriteArrayList, and support concurrency-multithreading.
//            list.add(1,"D"); // it will not throw ConcurrentModificationException as it uses CopyOnWriteArrayList, and support concurrency-multithreading.
        }

        System.out.println("After removing A");
        System.out.println(list);
    }
}

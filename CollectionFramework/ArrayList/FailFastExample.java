package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            list.remove( "A"); // This will throw ConcurrentModificationException
//            list.add(1,"D"); // This will throw ConcurrentModificationException
        }

        System.out.println(list);

    }

}

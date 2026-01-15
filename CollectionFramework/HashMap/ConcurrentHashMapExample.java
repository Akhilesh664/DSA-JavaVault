package CollectionFramework.HashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Amit");
        map.put(2, "Ravi");
        map.put(3, "Vijay");
        map.put(4, "Rahul");

        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" : "+map.get(itr.next()));

            // Concurrent modification allowed
            map.put(4,"rahul");  // No ConcurrentModificationException as it is failsafe
        }
        System.out.println("FinalMap"+map);

    }
}

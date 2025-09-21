package Top_Tech_Inteview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Apple", "Orange", "Banana",
                "Orange", "Orange", "Apple", "Orange", "Grape"};

        Map<String , Integer> freq = new HashMap<>();

        for(String str : fruits){
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        }

        // 1 Printing Way.
//        System.out.println(freq);

        // 2 Printing Way.
//        Iterator<Map.Entry<String, Integer>> it = freq.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry<String, Integer> entry = it.next();
//            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
//        }

        // 3 Printing Way.
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}

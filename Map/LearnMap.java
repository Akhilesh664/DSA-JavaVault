package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;




public class LearnMap {

    public static void main(String[] args) {

        // in (HashMap) it does not take care of order
//        Map<String, Integer> number = new HashMap<>();

        // in (TreeMap) it take care of order mean it automatically orders in lexicographical
        Map<String, Integer> number = new TreeMap<>();

        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
        number.put("Five", 5);

        // (Alphabetically) by default in hashmap printing it will print lexicographically (A-Z)
        System.out.println(number);

        number.remove("Three");

        System.out.println(number);

        // in hashmap whenever new value assigned in same present key it will override
        // if (key) is not present in map then put four - 23
//        if(!number.containsKey("four")){
//            number.put("Four", 23);
//        }
        //OR
        number.putIfAbsent("Ten", 10);

        System.out.println(number);

        System.out.println(number.containsValue(9));

        System.out.println(number.isEmpty());

        // way to iterate in hashmap
        for (Map.Entry<String,Integer> e : number.entrySet()){
            System.out.println(e); // key - value
            System.out.println(e.getKey()); // key
            System.out.println(e.getValue()); // value
        }

        // way to iterate in hashmap for key
        for(String key: number.keySet()){
            System.out.println(key);
        }

        // way to iterate in hashmap for value
        for(Integer value: number.values()){
            System.out.println(value);
        }

    }

}

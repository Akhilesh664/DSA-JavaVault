package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;import java.util.Map;


public class HashMapAndIdentityHashMap {

    public static void main(String[] args) {


        String s1 = new String("java");
        String s2 = new String ("java");
        String s3 = "java";
        String s4 = "java";

        HashMap<String, Integer> HashMapCheck = new HashMap<>(); // use equals() method in hashmap working

        HashMapCheck.put(s1,1);
        HashMapCheck.put(s2,2);
        HashMapCheck.put(s3,3);
        HashMapCheck.put(s4,4);


        IdentityHashMap<String, Integer> IdentityHashMapCheck = new IdentityHashMap<>(); // use == method in hashmap working

        IdentityHashMapCheck.put(s1,1);
        IdentityHashMapCheck.put(s2,2);
        IdentityHashMapCheck.put(s3,3);
        IdentityHashMapCheck.put(s4,4);


        System.out.println("HashMap: "+HashMapCheck);
        // Output: java => 1, java => 2, java => 3, java => 4 [ as first it check top 1, 2 it write java1, java 2, java 3, java 4 ] this is why integer 4 will override 3 ]
        System.out.println("IdentityHashMap: "+IdentityHashMapCheck);
//        Output: java => 1, java => 2, java => 4 [as first it check top 1, 2 it write java1, java 2, and then goes to stringpool where java is already there so java 4 will override 3 ]

    }

}

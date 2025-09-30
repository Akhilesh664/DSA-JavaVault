package Extra;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo_94 {
    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Rajendra");
        hm.put(101,"Vijay");
        hm.put(102,"Technolamror");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

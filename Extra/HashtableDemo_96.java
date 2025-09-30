package Extra;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo_96 {
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Rajendra");
        hm.put(102,"Praveen");
        hm.put(101,"Bipin");
        hm.put(103,"Pankaj");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

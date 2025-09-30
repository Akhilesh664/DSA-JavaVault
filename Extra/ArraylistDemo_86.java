package Extra;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo_86 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ram");
        list.add("bob");
        list.add("tom");
        list.add("jerry");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

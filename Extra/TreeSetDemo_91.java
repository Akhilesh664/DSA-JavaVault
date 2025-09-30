package Extra;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo_91 {
    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("cajendra");
        al.add("bob");
        al.add("ravi");
        al.add("technolamror");
        al.add("ravi");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

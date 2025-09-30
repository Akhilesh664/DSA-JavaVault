package Extra;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo_92 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Rajendra");
        queue.add("Ravi");
        queue.add("Technolamror");
        queue.add("cajendra");
        queue.add("bob");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("size:"+queue.size());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=============");
        queue.remove();
        queue.poll();
        System.out.println("size:"+queue.size());
        System.out.println("after removing 2 elements:");
        Iterator itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}

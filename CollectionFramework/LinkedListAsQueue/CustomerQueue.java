package LinkedListAsQueue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {

    public static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.offer("alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");

        System.out.println("Serving Customers: ");

        while(!customerQueue.isEmpty()){
            System.out.println("Served: "+customerQueue.poll());
        }
    }
}

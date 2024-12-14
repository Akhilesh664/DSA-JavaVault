package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // To put value in Queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(48);
        queue.offer(96);
        queue.offer(192);
        // add value in queue
        System.out.println(queue.add(100));// { .add(x) also do same thing but not used because it return exception if queue is empty }

        // Print queue
        System.out.println(queue);

        // Remove first element
        System.out.println(queue.poll());
        System.out.println(queue);

        // return first element similar { .element() also do same thing but not used because it return exception if queue is empty }
        System.out.println(queue.peek());

        // remove target from queue
        System.out.println(queue.remove(96));

        // is queue contains target
        System.out.println(queue.contains(192));

        System.out.println(queue);

        // printing size of queue
        System.out.println(queue.size());







    }
}

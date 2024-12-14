package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

         /**
         * A Priority Queue = is a specialized type of queue in computer science where each element is associated with a priority value.
         * Unlike a regular queue, where elements are processed in the order they arrive (FIFO - First In, First Out),
         * a priority queue processes elements based on their priority. In a priority queue, smaller elements
         * (or elements with higher priority) automatically come to the front of the queue, ensuring they are processed first.
         **/

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // We can reverse the order also as higher element comes first by using comparator
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // value insertion
        pq.offer(40);
        pq.offer(95);
        pq.offer(25);
        pq.offer(30);
        pq.offer(10);
        pq.offer(83);

        // printing priority queue
        System.out.println(pq);

        // for remove first element
        pq.poll();
        System.out.println(pq);

        // print first element in priority queue
        System.out.println(pq.peek());

        // remove target from Pq
        System.out.println(pq.remove(95));

        // is Pq contains target
        System.out.println(pq.contains(30));

        System.out.println(pq);

        // printing size of Pq
        System.out.println(pq.size());

    }
}

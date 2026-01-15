package CollectionFramework.LinkedListAsQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverse(Queue<Integer> queue) {

        if (queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverse(queue);
        queue.offer(front);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("Original Queue: " + queue);
        reverse(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

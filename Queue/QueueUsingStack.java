package Queue;
import java.util.Stack;

// Queue implementation using two stacks
class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>(); // Stack used for enqueue operation
    Stack<Integer> s2 = new Stack<>(); // Stack used for dequeue operation

    // Enqueue operation (add element to queue)
    void enqueue(int x) {
        // Simply push element into stack s1
        s1.push(x);
        System.out.println("Enqueued: " + x);
    }

    // Dequeue operation (remove element from queue)
    int dequeue() {

        // If both stacks are empty, queue is empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        // If s2 is empty, move all elements from s1 to s2
        // This reverses the order to maintain FIFO
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop from s2 gives the front of the queue
        int removed = s2.pop();
        System.out.println("Dequeued: " + removed);
        return removed;
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements
        queue.dequeue();
        queue.dequeue();

        // Enqueue more
        queue.enqueue(40);

        // Dequeue remaining
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Queue empty case
    }
}

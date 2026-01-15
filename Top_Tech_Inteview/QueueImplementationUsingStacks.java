package Top_Tech_Inteview;

import java.util.Stack;

public class QueueImplementationUsingStacks {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        peek();
        return output.pop();
    }
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
    public static void main(String[] args) {
        QueueImplementationUsingStacks q = new QueueImplementationUsingStacks();
        q.push(1);
        q.push(2);
        System.out.println(q.peek()); // Output: 1
        System.out.println(q.pop());  // Output: 1
    }
}

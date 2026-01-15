package CollectionFramework.Stack;

// 💡 Stack is a Last-In-First-Out (LIFO) data structure extending Vector, with push(), pop(), and peek() operations in O(1) time.

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());


        System.out.println("Top element: "+ stack.peek());
        stack.pop();
        System.out.println("Top element after pop: "+ stack.peek());

        // ================================================

        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
    }



}

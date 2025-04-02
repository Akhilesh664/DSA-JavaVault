package ArrayList;

import java.util.*;


public class CollectionsListDemo {

    public static void main(String[] args) {

        // ------------------ 1️⃣ ARRAYLIST ------------------
        System.out.println("\n🔹 ArrayList Example");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(25);
        System.out.println("ArrayList: " + arrayList);

        // Retrieving an element
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Removing an element
        arrayList.remove(Integer.valueOf(20));
        System.out.println("After removal: " + arrayList);

        // Sorting
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);

        // Iterating
        arrayList.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // ------------------ 2️⃣ LINKEDLIST ------------------
        System.out.println("\n🔹 LinkedList Example");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Akhilesh");
        linkedList.add("Java");
        linkedList.add("DSA");
        System.out.println("LinkedList: " + linkedList);

        // Add at first and last
        linkedList.addFirst("Hello");
        linkedList.addLast("World");
        System.out.println("After addFirst & addLast: " + linkedList);

        // Remove first and last
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removeFirst & removeLast: " + linkedList);

        // Convert LinkedList to Array
        String[] array = linkedList.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(array));

        // ------------------ 3️⃣ VECTOR ------------------
        System.out.println("\n🔹 Vector Example");
        Vector<Integer> vector = new Vector<>();
        vector.add(50);
        vector.add(100);
        vector.add(150);
        vector.add(200);
        System.out.println("Vector: " + vector);

        // Check capacity
        System.out.println("Vector Capacity: " + vector.capacity());

        // Multi-thread safety (Example)
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i * 10);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        // Wait for threads
        try {
//            join() method in Java is used to pause the execution of the current thread until another thread completes its execution.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Vector after multi-threading: " + vector);

        // ------------------ 4️⃣ STACK ------------------
        System.out.println("\n🔹 Stack Example");
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        System.out.println("Stack: " + stack);

        // Pop operation
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Peek operation
        System.out.println("Top Element (Peek): " + stack.peek());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for element
        System.out.println("Position of 'Java': " + stack.search("Java"));

    }
}

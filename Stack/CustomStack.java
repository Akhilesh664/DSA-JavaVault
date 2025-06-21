package Stack;

class CustomStack {
    int[] arr;
    int top;
    int capacity;

    CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Size
    public int size() {
        return top + 1;
    }

    // Display
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: 10 20 30

        System.out.println("Top: " + stack.peek()); // Output: 30

        stack.pop();
        stack.display(); // Output: 10 20
    }
}

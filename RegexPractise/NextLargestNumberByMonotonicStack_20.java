package RegexPractise;

import java.util.Stack;

public class NextLargestNumberByMonotonicStack_20 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = arr[i];
            }
            stack.push(i);
        }

        // handling the left over elements
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

    }


}

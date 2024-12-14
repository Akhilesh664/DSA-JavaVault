package String;
import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        // Test removeAdjacentDuplicates
        String duplicateInput = "abbaca";
        System.out.println("After removing adjacent duplicates: " + removeAdjacentDuplicates(duplicateInput));

    }

    // 2. Remove adjacent duplicates in a string
    public static String removeAdjacentDuplicates(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}

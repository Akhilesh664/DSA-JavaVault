package LeetCode;

import java.util.Stack;


public class Q18 {
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>(); // to store openingBrackets in it

            for (char ch : s.toCharArray()) { // traverse on ch.
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()){
                        return false;
                    }

                    char Top = stack.pop();
                    if ((ch == ')' && Top != '(') ||
                            (ch == '}' && Top != '{') ||
                            (ch == ']' && Top != '['))
                    {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isValid("()[]{}"));

    }
}
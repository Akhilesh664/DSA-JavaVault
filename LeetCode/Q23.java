package LeetCode;

import java.util.*;

public class Q23 {

    static class Solution {
        public String decodeString(String s) {
            Stack<StringBuilder> strs = new Stack<>(); // stack of strings made by strngbuilder
            Stack<Integer> nums = new Stack<>();
            StringBuilder current = new StringBuilder();

            int k = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (Character.isDigit(c)) {
                    k = k * 10 + (c - '0');
                }
                else if (c == '[') {
                    nums.push(k);
                    strs.push(current);    // save current string
                    current = new StringBuilder();
                    k = 0;              // set to 0
                }
                else if (c == ']') {

                    int repeat = nums.pop();
                    StringBuilder prev = strs.pop();

                    // repeat current string and put it in prev
                    for (int j = 0; j < repeat; j++) {
                        prev.append(current);
                    }
                    current = prev;
                }
                // prev in current
//                current = prev;
                else {
                    current.append(c);  // regular char
                }
            }

            return current.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.decodeString("3[a]2[bc]"));
    }
}
package LeetCode;

import java.util.*;

public class Q32 {

    static class Solution {

        private int vowelTotal(String text) {
            int total = 0;

            for (int k = 0; k < text.length(); k++) {
                char ch = Character.toLowerCase(text.charAt(k));

                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        total++;
                }
            }

            return total;
        }

        private String invert(String word) {
            char[] letters = word.toCharArray();
            int left = 0, right = letters.length - 1;

            while (left < right) {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }

            return new String(letters);
        }

        public String reverseWords(String sentence) {

            String[] parts = sentence.trim().split("\\s+");
            int baseVowelCount = vowelTotal(parts[0]);

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < parts.length; i++) {

                String current = parts[i];

                if (i > 0 && vowelTotal(current) == baseVowelCount) {
                    current = invert(current);
                }

                if (i > 0) {
                    result.append(" ");
                }

                result.append(current);
            }

            return result.toString();
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        String test1 = "hello world apple";
        System.out.println(sol.reverseWords(test1));

    }
}

package LeetCode;

public class Q9 {

    static class Solution {
        public int lengthOfLastWord(String s) {
            String[] words = s.trim().split("\\s+");

            int length = words.length;
            String str = words[length - 1];

            return str.length();
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "  Hello World my name is akhilesh    ";
        int result = solution.lengthOfLastWord(s);

        System.out.println(result);
    }
}

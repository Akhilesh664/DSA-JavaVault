package LeetCode;

public class Q11 {

    static class Solution {
        // public boolean isPalindrome(String s) {
        //
        //     s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //     char[] str = s.toCharArray();
        //
        //     int i = 0;
        //     int j = str.length-1;
        //
        //     while(i < j){
        //         if(str[i] != str[j]){
        //             return false;
        //         }
        //         i++;
        //         j--;
        //     }
        //     return true;
        // }

        public boolean isPalindrome(String s) {

            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            StringBuilder sb = new StringBuilder(s);
            String reversed = sb.reverse().toString();

            return s.equals(reversed);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);

        System.out.println(result);
    }
}


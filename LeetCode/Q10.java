package LeetCode;

public class Q10 {

    static class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length();
            int m = needle.length();

            // edge case
            if (m == 0){
                return 0;
            }
            // edg case
            if (m > n){
                return -1;
            }

            // loop fro iterate on haystack
            for (int i = 0; i <= n - m; i++) {
                String sub = haystack.substring(i, i + m);

                if (sub.equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }

// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack = "hello";
        String needle = "ll";

        int result = solution.strStr(haystack, needle);
        System.out.println(result);
    }
}


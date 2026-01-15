package LeetCode;

import java.util.*;

public class Q13 {

    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            // for storing final answer in it. as list of list
            List<List<String>> ans = new ArrayList<>();

            // for track which is visitedd.
            boolean[] used = new boolean[strs.length];

            for (int i = 0; i < strs.length; i++) {
                if (used[i]){
                    continue;
                }

                List<String> grp = new ArrayList<>();
                grp.add(strs[i]);
                used[i] = true;

                for (int j = i + 1; j < strs.length; j++) {

                    if ( !used[j] && isAnag(strs[i], strs[j])) {
                        grp.add(strs[j]);
                        used[j] = true;
                    }
                }

                ans.add(grp); // at last save into fiinal ans list
            }

            return ans;
        }

        private boolean isAnag(String a, String b) {
            if (a.length() != b.length()) return false;
            char[] ca = a.toCharArray();
            char[] cb = b.toCharArray();
            Arrays.sort(ca);
            Arrays.sort(cb);
            return Arrays.equals(ca, cb);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] test1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(test1));

        String[] test2 = {""};
        System.out.println(sol.groupAnagrams(test2));

        String[] test3 = {"a"};
        System.out.println(sol.groupAnagrams(test3));
    }
}
package LeetCode;

import java.util.HashMap;

public class Q16 {

    static class Solution {
        public boolean areAnagrams(String s1, String s2) {
            s1 = s1.replaceAll("\\s", "").toLowerCase();
            s2 = s2.replaceAll("\\s", "").toLowerCase();

            if (s1.length() != s2.length()){
                return false;
            }

            // HAshmap
            HashMap<Character, Integer> map = new HashMap<>();
            // mapping freq of specific char
            for (char c : s1.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : s2.toCharArray()) {// here checking s2 frez is same or not
                if (!map.containsKey(c)) return false;

                int temp = map.get(c);
                if (temp == 1) {
                    map.remove(c);
                }
                else {
                    map.put(c, temp - 1);
                }
            }

            return map.isEmpty();
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.areAnagrams("listen", "silent"));

    }
}
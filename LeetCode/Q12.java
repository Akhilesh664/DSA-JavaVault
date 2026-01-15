package LeetCode;

import java.util.*;

public class Q12 {

    static class Solution{

        public static boolean isSameShape(String s1, String s2) {
            if (s1.length() != s2.length()){
                return false;
            }

            // Hashmap createion
            HashMap<Character, Character> m = new HashMap<>();

            for (int i = 0; i < s1.length(); i++) {
                char a = s1.charAt(i);

                char b = s2.charAt(i);

                if (m.containsKey(a)) {
                    if (m.get(a) != b){
                        return false;
                    }
                }
                else {
                    // check if b is already mapped or not
                    if (m.containsValue(b)){
                        return false;
                    }
                    m.put(a, b);
                }
            }


            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // test cases
        System.out.println(solution.isSameShape("egg", "add"));

    }

}
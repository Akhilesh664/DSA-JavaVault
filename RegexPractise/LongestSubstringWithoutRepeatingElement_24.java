package RegexPractise;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingElement_24 {


    public static String LongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        int start = 0;   // start index of longest substring

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }





    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(LongestSubstring(str));
    }

}

package String;

// Given a string s, find the first non-repeating character and return its index. If there is no unique character, return -1.
// Input: s = "loveleetcode"
// Output: 2 // 'v' is the first non-repeating character
// using Hashmap key, value pair

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString_2 {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(checkRepeating(str));
    }

    public static char checkRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();// for filling freq of ch Or Freq[256]

        // increasing character number from 1
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return 0;
    }
}

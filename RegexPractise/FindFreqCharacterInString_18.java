package RegexPractise;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

public class FindFreqCharacterInString_18 {

    // 1. Way
    public static void main(String[] args) {
        String str = "abcdcbada";

        int count = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (int value : charCount.values()) {
            if (value >= 1) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(charCount);

    }

    // 2. Way
//    public static void main(String[] args) {
//        String str = "abcdcbada";
//
//        HashSet<Character> set = new HashSet<>();
//
//        for(char ch : str.toCharArray()){
//            set.add(ch);
//        }
//
//        System.out.println(set.size());
//    }


}

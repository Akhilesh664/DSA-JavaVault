package Top_Tech_Inteview;

import java.util.HashMap;

public class CharOccurrence {

    // 1 Way.
    public static void main(String[] args) {
        String str = "automation";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        System.out.println(charCount);
    }

    // 2 , 3rd Ways Patterns are in String package filename: [firstNonRepeatingCharInString,..2]

}

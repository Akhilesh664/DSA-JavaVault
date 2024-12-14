package String;

//import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

//    private static boolean areAnagrams(String str1, String str2) {
//
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        return Arrays.equals(arr1, arr2);
//
//    }

    static boolean areAnagrams(String str1, String str2) {

        // edge case
        if (str1.length() != str2.length()) {
            return false;
        }

        // hashmap creation named hmap1
        HashMap<Character, Integer> hmap1 = new HashMap<>();

        char[] arr1 = str1.toCharArray();

        // Mapping first string
        for (char c : arr1) {
            hmap1.put(c, hmap1.getOrDefault(c, 0) + 1);
        }

        // Removing characters of second string from hashmap
        for (char c : str2.toCharArray()) {
            if (!hmap1.containsKey(c)) {
                return false; // If a character is not found in the hashmap, it's not an anagram
            }
            int count = hmap1.get(c);
            if (count == 1) {
                hmap1.remove(c); // Remove character if count is 1
            } else {
                hmap1.put(c, count - 1); // Decrement count otherwise
            }
        }

        // If hashmap is empty, strings are anagrams
        return hmap1.isEmpty();
    }
}


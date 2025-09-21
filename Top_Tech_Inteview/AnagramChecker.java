package Top_Tech_Inteview;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // 1 Way.
//    private static boolean areAnagrams(String str1, String str2) {
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);
//    }


    // 2 Way.
    private static boolean areAnagrams(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hmap = new HashMap<>();
        char[] arr1 = str1.toCharArray();
        for(char c : arr1){
            hmap.put(c, hmap.getOrDefault(c, 0)+1);
        }
        for (char c : str2.toCharArray()){
            if(!hmap.containsKey(c)){
                return false;
            }
            int count = hmap.get(c);
            if(count == 1){
                hmap.remove(c);
            }else{
                hmap.put(c, count-1);
            }
        }
        return hmap.isEmpty();
    }
}
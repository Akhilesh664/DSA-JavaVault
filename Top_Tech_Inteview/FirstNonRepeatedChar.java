package Top_Tech_Inteview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    // 1 Way.
//    public static void main(String[] args) {
//        String str = "programming";
//        Map<Character, Integer> freq = new HashMap<>();
//
//        for (char ch : str.toCharArray()) {
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : str.toCharArray()) {
//            if (freq.get(ch) == 1) {
//                System.out.println("First non-repeated char: " + ch);
//                break;
//            }
//        }
//    }

    // 2 Way.
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];
        for(char ch : str.toCharArray()){
            freq[ch]++;
        }
        for(char ch : str.toCharArray()){
            if(freq[ch] == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}

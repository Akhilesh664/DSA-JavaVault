package RegexPractise;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayDivByK_14 {

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, -2, -3, 1}; // input array
        int k = 6;

        Map<Integer, Integer> map = new HashMap<>(); // initializing HashMap to store remainder frequencies
        map.put(0, 1); // remainder 0 appears once initially (empty prefix case)

        int prefix = 0; // prefix will act as total Sum
        int count = 0; // this will track the number of valid subarrays

        for (int i = 0; i < nums.length; i++) {  // iterate on array
            prefix += nums[i]; // managing cumulative sum
            int mod = prefix % k; // calculate remainder

            if (mod < 0){
                mod += k;
            } // important for negative numbers (Java gives negative mod values)

            // if this remainder appeared before, then all those previous indexes form valid subarrays
            if (map.containsKey(mod)) {
                count += map.get(mod); // add how many times same remainder appeared
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1); // increase frequency of remainder
        }

        System.out.println(count); // total number of valid SubArrays divisible by k
    }
}

package LeetCode;

import java.util.*;

public class Q27 {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>(); // Hashmap
            map.put(0, 1);


            int freq = 0;

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];

                if (map.containsKey(sum-k)) {
                    freq += map.get(sum - k);
                }

                else {
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

            return freq;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1,1,1};
        System.out.println(s.subarraySum(arr1, 2));

    }
}
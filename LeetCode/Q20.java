package LeetCode;

import java.util.*;

public class Q20 {

    static class Solution {
        // brute force approach
//        public boolean checkSubarraySum(int[] nums, int k) {
//            // brute force solution O(n^2) - not optimal but works
//            for (int i = 0; i < nums.length; i++) {
//                int sum = 0;
//                for (int j = i; j < nums.length; j++) {
//                    sum += nums[j];
//                    // need at least 2 elements
//                    if (j - i + 1 > 1 && sum % k == 0) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }

//         better solu. with hashmap - in O(n)
         public boolean checkSubarraySum(int[] nums, int k) {
             Map<Integer, Integer> map = new HashMap<>(); // Hashmap crated
             map.put(0, -1); // base case

             int prefix = 0;

             for (int i = 0; i < nums.length; i++) {
                 prefix += nums[i];

                 int temp = prefix % k;
                 if (map.containsKey(temp)) {
                     if (i - map.get(temp) > 1) {
                         return true;
                     }
                 } else {
                     map.put(temp, i);
                 }
             }
             return false;
         }
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        // test
        int[] arr1 = {23,2,4,6,7};
        System.out.println(s.checkSubarraySum(arr1, 6)); // true

    }
}
package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q34 {

    static class Solution {
//        public int findDuplicate(int[] nums) {
//            // making set
//            Set<Integer> seen = new HashSet<>();
//
//            for (int num : nums) {
//
//                if (seen.contains(num)) {
//                    return num;
//                }seen.add(num);
//            }
//
//            return -1; // shouldn't reach here
//        }

        public int findDuplicate(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);

                if (map.get(num) > 1) {
                    return num;
                }
            }

            return -1;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1,3,4,2,2};
        System.out.println(sol.findDuplicate(nums1));

    }
}

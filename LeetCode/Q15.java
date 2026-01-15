package LeetCode;

import java.util.HashSet;
import java.util.Set;



public class Q15 {

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> uniqueSet = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {

                if (i > k) {
                    uniqueSet.remove(nums[i - k - 1]); // remove no. from set
                }

                if (!uniqueSet.add(nums[i])) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1,2,3,1,2,3};
        System.out.println(s.containsNearbyDuplicate(arr1, 2));

    }
}
package LeetCode;

import java.util.Arrays;

public class Q4 {

    static class Solution {
        public int arrayPairSum(int[] nums) {
            int sum = 0;
            Arrays.sort(nums);

            for (int i = nums.length - 1; i >= 0; i -= 2) {
                sum = sum + Math.min(nums[i], nums[i - 1]);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 4, 3, 2};
        int result = solution.arrayPairSum(nums);

        System.out.println("Result: " + result);
    }
}



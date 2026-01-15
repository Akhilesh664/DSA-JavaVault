package LeetCode;

import java.util.Arrays;

public class Q3 {
//    static class Solution {
//
//        public int[] findErrorNums(int[] nums) {
//
//            int x = -1;      // duplicate number
//            int miss = -1;   // missing number
//
//            // First pass: identify duplicate using index marking
//            for (int i = 0; i < nums.length; i++) {
//                int pos = Math.abs(nums[i]) - 1;
//
//                if (nums[pos] < 0) {
//                    x = Math.abs(nums[i]);
//                } else {
//                    nums[pos] = nums[pos] * -1;
//                }
//            }
//
//            // Second pass: identify missing number
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] > 0) {
//                    miss = i + 1;
//                    break;
//                }
//            }
//
//            return new int[] { x, miss };
//        }
//    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] nums = {1, 2, 2, 4};
//
//        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
//    }

    public static void main(String[] args) {
        // Set mismatch
        int[] ans = new int[2];
        int[] nums = {1,2,2,4};

        int n = nums.length;
        int expSum = (n * ( n+ 1 )/2);

        int sum=0;
        int duplicate =-1;

        //
        for(int i=0;i<n;i++) {
            sum += nums[i];
            if(i>0  && nums[i-1]==nums[i]) {
                duplicate = nums[i];
            }
        }

        int missed = expSum -(sum-duplicate);
        ans[0] = duplicate;// collect in ans
        ans[1] = missed;

        System.out.println("Missing: "+Arrays.toString(ans));


    }



}

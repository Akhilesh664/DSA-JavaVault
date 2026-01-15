package LeetCode;

public class Q8 {

    static class Solution {
        // // TLE as it is using O(n^2)
        // public int minSubArrayLen(int target, int[] nums) {
        //
        //     int minLen = Integer.MAX_VALUE;
        //
        //     for (int i = 0; i < nums.length; i++) {
        //         int sum = 0;
        //         for (int j = i; j < nums.length; j++) {
        //             sum += nums[j];
        //             if (sum >= target) {
        //                 minLen = Math.min(minLen, j - i + 1);
        //                 break;
        //             }
        //         }
        //     }
        //
        //     return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
        // }


        // Time Complexity : O(n)
        public int minSubArrayLen(int target, int[] nums) {
            int s = 0;
            int curSum = 0;
            int answer = Integer.MAX_VALUE;

            for (int e = 0; e < nums.length; e++) {
                curSum += nums[e];

                while (curSum >= target)
                {
                    answer = Math.min(answer, e - s + 1);
                    curSum -= nums[s];
                    s++;
                }
            }
            return (answer == Integer.MAX_VALUE) ? 0 : answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = solution.minSubArrayLen(target, nums);
        System.out.println(result);
    }
}


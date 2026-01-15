package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {

    static class Solution {
        // public List<Integer> findDuplicates(int[] nums) {
        //     List<Integer> result = new ArrayList<>();
        //
        //     for (int i = 0; i < nums.length; i++) {
        //         int index = Math.abs(nums[i]) - 1;
        //
        //         if (nums[index] < 0) {
        //             result.add(Math.abs(nums[i])); // duplicate is there means found
        //         } else {
        //             nums[index] = -nums[index]; // mark it as visited and go further
        //         }
        //
        //     }
        //
        //     return result;
        // }

        public List<Integer> findDuplicates(int[] nums) {

            ArrayList<Integer> al = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    al.add(nums[i]);
                }
            }
            return al;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution.findDuplicates(nums));
    }
}



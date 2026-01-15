package LeetCode;

import java.util.Arrays;

public class Q19 {

    static class Solution {
        public void sortColors(int[] nums) {
            int curr = 0;
            int left = 0;
            int right = nums.length - 1;


            while (curr <= right) {
                if (nums[curr] == 0) {
                    swap(nums, left, curr);
                    left++;
                    curr++;
                } else if (nums[curr] == 1) {
                    curr++;
                } else {
                    swap(nums, curr, right);
                    right--;
                }
            }
        }
 // for swaping calls
        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {2,0,2,1,1,0};
        s.sortColors(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
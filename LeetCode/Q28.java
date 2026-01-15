package LeetCode;

public class Q28 {
    static class Solution {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (nums[mid] >= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {3,4,5,1,2};
        System.out.println(s.findMin(arr1));

    }
}
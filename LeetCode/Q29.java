package LeetCode;

public class Q29 {

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;


            // binary serch
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            return left;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, 3, 5, 6};
        System.out.println(s.searchInsert(arr1, 5));
    }
}
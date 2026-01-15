package LeetCode;

public class Q14 {

    static class Solution {
        public int majorityElement(int[] nums) {
            int count = 0, candidate = 0;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);

        System.out.println(result);
    }
}



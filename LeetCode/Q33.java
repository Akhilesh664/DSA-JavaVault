package LeetCode;
import java.util.*;

public class Q33 {
    static class Solution {

        public int[] twoSum(int[] values, int target) {

            int length = values.length;

            for (int index = 0; index < length; index++) {

                int needed = target - values[index];
                int low = index + 1;
                int high = length - 1;

                while (low <= high) {

                    int mid = low + (high - low) / 2;

                    if (values[mid] == needed) {
                        return new int[]{index + 1, mid + 1};
                    }

                    if (values[mid] < needed) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            return new int[]{-1, -1};
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = sol.twoSum(nums1, 9);
        System.out.println(Arrays.toString(result1));

    }
}

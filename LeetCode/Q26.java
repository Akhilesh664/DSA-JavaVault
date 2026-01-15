package LeetCode;

import java.util.Arrays;

public class Q26 {

    static class Solution {
//        public int[] productExceptSelf(int[] nums) {
//            int n = nums.length;
//            int[] result = new int[n];
//
//            for (int i = 0; i < n; i++) {
//                int product = 1;
//
//                for (int j = 0; j < n; j++) {
//                    if (i != j) {
//                        product *= nums[j];
//                    }
//                }
//
//                result[i] = product;
//            }
//
//            return result;
//        }

        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];

            // left side Prefix products
            ans[0] = 1;
            for (int i = 1; i < n; i++) {
                ans[i] = ans[i - 1] * nums[i - 1];
            }



            // right side Suffixx products
            int right = 1;
            for (int i = n - 1; i >= 0; i--) {
                ans[i] = ans[i] * right;

                right *=  nums[i];
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1, 2, 3, 4};
        int[] result1 = s.productExceptSelf(arr1);
        System.out.println(Arrays.toString(result1));

    }
}
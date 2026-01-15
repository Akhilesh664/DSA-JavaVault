package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q35 {

    static class Solution {
        public int[] intersection(int[] arr1, int[] arr2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> commonIntersection = new HashSet<>();

            for (int n : arr1) {
                set1.add(n);
            }

            for (int n : arr2) {
                if (set1.contains(n)) {
                    commonIntersection.add(n);
                }
            }

            int m = commonIntersection.size();
            int idx = 0;

            int[] result = new int[m];
            for (int num : commonIntersection) {
                result[idx++] = num;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res1 = s.intersection(nums1, nums2);
        System.out.println(Arrays.toString(res1));


    }
}
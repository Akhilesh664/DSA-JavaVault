package LeetCode;

public class Q6 {

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] crr = new int[m + n];
            int i = 0, j = 0, k = 0;

            // Merge like your logic
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) {
                    crr[k++] = nums1[i++];
                } else {
                    crr[k++] = nums2[j++];
                }
            }

            while (i < m) {
                crr[k++] = nums1[i++];
            }

            while (j < n) {
                crr[k++] = nums2[j++];
            }

            for (int x = 0; x < m + n; x++) {
                nums1[x] = crr[x];
            }
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        // Print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}


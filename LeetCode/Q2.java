package LeetCode;

import java.util.TreeSet;

public class Q2 {

    static class Solution {

        // public int thirdMax(int[] nums) {

        //     int firstmax = Integer.MIN_VALUE;
        //     int secmax = Integer.MIN_VALUE;
        //     int thirdmax = Integer.MIN_VALUE;

        //     for (int n : nums){
        //         if(n > firstmax){
        //             thirdmax = secmax;
        //             secmax = firstmax;
        //             firstmax = n;
        //         } else if (n > secmax && n!= firstmax) {
        //                thirdmax= secmax;
        //             secmax = n;
        //         } else if (n > thirdmax && n!= secmax){
        //             thirdmax = n;
        //         }
        //     }

        //     if(nums.length<=2){
        //         return nums[nums.length-1];
        //     }else{
        //         return (int)thirdmax;
        //     }
        // }


        // public int thirdMax(int[] nums) {
        //     Arrays.sort(nums);  // ascending order

        //     int distinctCount = 1;
        //     int maxIndex = nums.length - 1;
        //     int current = nums[maxIndex]; // first max

        //     for (int i = nums.length - 2; i >= 0; i--) {
        //         if (nums[i] != nums[i + 1]) {  // next distinct number
        //             distinctCount++;
        //             current = nums[i];

        //             if (distinctCount == 3) {
        //                 return current;  // found 3rd max
        //             }
        //         }
        //     }

        //     // If fewer than 3 distinct numbers
        //     return nums[maxIndex];
        // }


        public int thirdMax(int[] nums) {
            TreeSet<Integer> set = new TreeSet<>();

            for (int n : nums) {
                set.add(n);
                if (set.size() > 3) {
                    set.pollFirst();
                }
            }

            return set.size() == 3 ? set.first() : set.last();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};

        System.out.println(solution.thirdMax(nums1)); // 1
        System.out.println(solution.thirdMax(nums2)); // 2
        System.out.println(solution.thirdMax(nums3)); // 1
    }

}

package Top_Tech_Inteview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {


    // 1 Way.
//    public static int majorityElement(int[] nums) {
//        int count = 0, candidate = 0;
//        for (int num : nums) {
//            if (count == 0) candidate = num;
//            count += (num == candidate) ? 1 : -1;
//        }
//        return candidate;
//    }
//    public static void main(String[] args) {
//        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
//        // Output: 2
//    }


    // 2 Way.
//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > n / 2) return num;  // early exit if found
//        }
//        return -1; // Should not happen if majority element is guaranteed
//    }
//
//    public static void main(String[] args) {
//        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Output: 2
//    }


    // 3 Way.
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2})); // Output: 2
    }

}

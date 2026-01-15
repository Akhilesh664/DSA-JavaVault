package LeetCode;

public class Q30 {

//    static class Solution {
//        public int minSubArrayLen(int target, int[] nums) {
//            int n = nums.length;
//
//            int[] prefix = new int[n+1];
//            for(int i = 0; i <n ;i++){
//                prefix[i+1] = prefix[i]+ nums[i];
//            } // for prefix
//
//            int minLen = Integer.MAX_VALUE;
//
//            for(int left = 0; left <= n; left++){
//                int right = bsearch(prefix, left+1, n+1, prefix[left] + target);
//                if(right == n+1){
//                    break;
//                }
//                minLen = Math.min(minLen, right - left);
//            }
//
//            return minLen == Integer.MAX_VALUE ? 0 : minLen;
//        }
//
//        // binary search
//        private int bsearch(int[] arr, int low, int high, int target){
//            while(low < high){
//
//                int mid = ((low + high) / 2);
//                if(arr[mid] >= target){
//                    high = mid;
//                }
//                else {
//                    low = mid + 1; // arr[mid] < target
//                }
//            }
//            return low;
//        }
//    }

    static class Solution {

        public int minSubArrayLen(int target, int[] values) {

            int left = 0;
            int runningSum = 0;
            int shortest = Integer.MAX_VALUE;

            for (int right = 0; right < values.length; right++) {

                runningSum += values[right];

                while (runningSum >= target) {

                    int windowSize = right - left + 1;
                    if (windowSize < shortest) {
                        shortest = windowSize;
                    }

                    runningSum -= values[left];
                    left++;
                }
            }

            return shortest == Integer.MAX_VALUE ? 0 : shortest;
        }
    }


    public static void main(String[] args){
        Solution s = new Solution();

        int[] test1 = {2,3,1,2,4,3};
        System.out.println(s.minSubArrayLen(7, test1));


    }
}
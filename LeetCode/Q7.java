package LeetCode;

public class Q7 {


    static class Solution {
        public int mySqrt(int x) {

            int low = 1, high = x / 2, ans = 0;

            // edge case
            if (x < 2) {
                return x;
            }
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long square = (long) mid * mid; // long to avoid overflow because it is craeting TLE in leetcode


                if (square == x) {
                    return mid;
                }
                else if(square <x) {
                    ans = mid;
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int x = 8;
        int result = solution.mySqrt(x);

        System.out.println("Square root of " + x + " is: " + result);
    }
}



package RegexPractise;

public class SquareRootFromBinarySearch_17 {

    public static void main(String[] args) {
        int n = 16;
        System.out.println("Square root: " + sqrt(n)); // Output: 4
    }

    public static int sqrt(int n) {
        if (n < 2) return n;

        int low = 1, high = n / 2, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid; // long to avoid overflow

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans; // integer part when not perfect square
    }


}

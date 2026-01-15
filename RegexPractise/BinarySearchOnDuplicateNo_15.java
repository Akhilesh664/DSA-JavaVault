package RegexPractise;

public class BinarySearchOnDuplicateNo_15 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 4, 5, 7, 9, 19};
        int n = arr.length;
        int T = 2;

        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;   // fixed

            if (arr[m] == T) {
                ans = m;   // store index
                e = m - 1; // move left to find first occurrence
            } else if (arr[m] > T) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        if (ans == -1) {
            System.out.println("target not found");
        } else {
            System.out.println(ans);   // prints first occurrence
        }
    }
}

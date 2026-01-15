package RegexPractise;

public class FindSubarraySumFromQueryArrays_16 {
    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Range queries {startIndex, endIndex}
        int[][] query = {
                {1, 2},
                {3, 5},
                {0, 6}
        };

        // Step 1: Build prefix sum array
        int[] prefix = buildPrefixSum(arr);

        // Step 2: Answer each query using prefix sum
        for (int i = 0; i < query.length; i++) {
            int L = query[i][0];  // start index of range
            int R = query[i][1];  // end index of range

            // find sum from L to R using prefix array
            int sum = findSubArraySum(prefix, L, R);

            // print the result
            System.out.println("Sum from " + L + " to " + R + " = " + sum);
        }
    }


    // Method to build prefix sum array
    public static int[] buildPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];

        // first element of prefix sum is same as array
        prefixSum[0] = arr[0];

        // add current element to previous prefix value
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum; // return built prefix array
    }


    // Method to calculate range sum using prefix sum array
    public static int findSubArraySum(int[] prefix, int L, int R) {
        // if starting index is 0, prefix[R] is the sum
        if (L == 0)
            return prefix[R];
        // otherwise subtract prefix before the L range
        return prefix[R] - prefix[L - 1];
    }

}

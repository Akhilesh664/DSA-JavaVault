package RegexPractise;

import java.util.Arrays;

// Regex test - 2 [Selection sort]

public class SelectionSort_16 {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

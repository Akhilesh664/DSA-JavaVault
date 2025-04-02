package SortingAglorithm;

//💡 InsertionSort: Builds a sorted array one item at a time by inserting elements into the correct position.
// Time Complexity: O(n²) (Worst & Average), O(n) (Best - Already Sorted).

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) { // Shift elements to make space
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

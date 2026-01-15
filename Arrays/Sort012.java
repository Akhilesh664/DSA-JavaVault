// T : O(n), S : O(1) [less efficient then DNF]

package Arrays;

public class Sort012 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        for(int num : arr) {
            System.out.print(num+" ");
        }
    }

    public static void sort012(int[] arr) {
        int left = 0, right = arr.length - 1;

        // Move all 0s to the left side
        while (left < right) {
            while (arr[left] == 0) left++;
            while (arr[right] != 0) right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Now move 1s next (between 0 and 2)
        right = arr.length - 1;
        while (left < right) {
            while (arr[left] == 1) left++;
            while (arr[right] != 1) right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

}

package Arrays;

public class Sort012 {

    public static void main(String[] args) {

        int[] arr1 = {0, 2, 1, 0, 1, 1, 2, 0, 2, 1, 1, 0};
        Sort012Function(arr1);
        for (int num : arr1){
            System.out.println(num+" ");
        }
    }

    public static void Sort012Function(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high--);
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

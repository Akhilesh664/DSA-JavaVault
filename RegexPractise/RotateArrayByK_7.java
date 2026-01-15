package RegexPractise;

import java.util.Scanner;

// RegexTest - 2  [Rotate by k places?]

public class RotateArrayByK_7 {

    public static void main(String[] args) {


        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements for array : ");
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < k; i++){
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        // Rotated Array
        for(int m : arr){
            System.out.print(m+" ");
        }


    }
}

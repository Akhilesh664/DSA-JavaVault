package Top_Tech_Inteview;

import java.util.Scanner;

public class MergingSortedArrays {

    // 1 Way.
//    public static void main(String[] args) {
//        int[] arr = {10,30,50,80,100};
//        int m = arr.length;
//        int[] brr = {20,40,60,70,101,200};
//        int n = brr.length;
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        int[] crr = new int[n+m];
//        while(i < m && j < n) {
//            if(arr[i] < brr[j]) {
//                crr[k] = arr[i];
//                k++;
//                i++;
//            }else {
//                crr[k] = brr[j];
//                k++;
//                j++;
//            }
//        }
//        while(i < m) {
//            crr[k] = arr[i];
//            k++;
//            i++;
//        }
//        while(j < n) {
//            crr[k] = brr[j];
//            k++;
//            j++;
//        }
//        for(int num : crr) System.out.print(num+" ");
//    }



    // 2 Way.
    public static void main(String[] args) {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for n, m : ");
        n = s.nextInt();
        m = s.nextInt();
        int[] arr = new int[n+m];

        System.out.println("Enter elements for arr[] : ");
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        int[] brr = new int[10];
        System.out.println("Enter elements for brr[] : ");
        for(int i=0; i<m; i++) {
            brr[i] = s.nextInt();
        }
        // Intuition :
        // starting from right side from both arrays by which we can compare both arr elements which ever is biggest put it on arr's right side
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0) {
            if(arr[i] > brr[j]) {
                arr[k] = arr[i];
                i--;
                k--;
            }else {
                arr[k] = brr[j];
                j--;
                k--;
            }
        }
        // if elements left in brr arrays put all elements in arr
        while(j>=0) {
            arr[k] = arr[j];
            j--;
            k--;
        }
        System.out.println("merged sorted array of arr, brr : ");
        for(int num : arr) {
            System.out.print(num +" ");
        }
    }

}

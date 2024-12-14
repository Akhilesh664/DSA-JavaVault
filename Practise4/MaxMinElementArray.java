package Practise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinElementArray {

	public static void main(String[] args) {
		
		// creating array
		System.out.println("enter the size of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		// inserting elements
		System.out.println("Enter the elements for array : ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		// 3rd way ======
//		System.out.println("Enter the elements for array : ");
//		int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        
//		for(int i=0; i<n; i++) {
//			int input = s.nextInt();
//			if(max < input) {
//				max = input;
//			}if(min > input) {
//				min = input;
//		    }
//			
//			arr[i] = input;
//		}
//		
//		System.out.println(max+" , "+min+" Diff:"+ (max - min));
		
		// display
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		System.out.println();

//		// 1st way=========
//		Arrays.sort(arr);
//		
//		System.out.println("Min element : "+arr[0]);
//		System.out.println("Max element : "+arr[n-1]);
//		System.out.println("Difference of min, max elements : "+(arr[n-1] - arr[0]));

//		// 2nd way==========
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i=1; i<n; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}else if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
//		System.out.println(max - min);
	
	}

}

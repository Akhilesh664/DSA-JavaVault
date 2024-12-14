package Practise4;

import java.util.Scanner;

public class BarGraphPattern {
	
	public static void main(String[] args) {
		
		// creating array
		System.out.println("enter the size of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		// inserting elements in array and finding max
		System.out.println("Enter the elements for array : ");
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int input = s.nextInt();
			if(max < input) {
				max = input;
			}
			arr[i] = input;
		}
		
		// array printing
//		System.out.println("Array : ");
//		for(int num : arr) {
//			System.out.print(num+" ");
//		}
		
		// 1st (-->) pattern printing
		System.out.println("\n (left to Right):");
		for(int i=0; i<n; i++) {
			for(int j=0; j < arr[i]; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		// 2nd (<--) Pattern printing
		System.out.println("\n (Right to left):");
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < max - arr[i]; j++) {
                System.out.print("   ");
            }
            // Print stars
            for (int j = 0; j < arr[i]; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
		
//		// 3nd (from bottom to top) pattern printing
//        System.out.println("\nUpwards (Bottom to Top):");
//        for (int i = max; i > 0; i--) {
//            for (int j = 0; j < n; j++) {
//                if (arr[j] >= i) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
        
        
        //or
        System.out.println("\nUpwards (Bottom to Top):");
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < n; j++) { // Changed to j = 0 to cover all elements in the array
                if (arr[j] > max - i) {   // Assuming 'arr[j]' contains height values to compare with 'max - i'
                    System.out.print(" * ");
                } else {
                    System.out.print("   "); // Prints spaces
                }
            }
            System.out.println(); // Move to the next line after inner loop
        }
        

        // 4rd (from top to bottom) pattern printing
        System.out.println("\nDownwards (Top to Bottom):");
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
       
	}

}

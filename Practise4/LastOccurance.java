package Practise4;

import java.util.Scanner;

public class LastOccurance {
	public static void main(String[] args) {
		
		// making array
		System.out.println("enter the size of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		// inserting elements
		System.out.println("Enter the elements for array : ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		// Enter target for array 
		System.out.println("Enter the target for first Occurance");
		int target = s.nextInt();
		int position = -1; 
		boolean flag = false;
		
		// loop for iterate for finding target  
		for(int i=n-1; i>=0; i--) {
			if(arr[i] == target) {
				position = i;
				System.out.println("Target found at index : "+position);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Target is not in array : "+position);
		}	
		
		
	}
	
}

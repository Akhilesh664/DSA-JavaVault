package Practise4;

import java.util.Scanner;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		

		// making array
		System.out.println("enter the size of array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		// inserting elements
		System.out.println("Eneter the elements for array : ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		// displaying array
		System.out.println("Array : ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		// finding second-max and max
		{
			if(n < 2) {
				System.out.println("Array must contain at least two elements.");
			}
			int Max = Integer.MIN_VALUE;
			int secdMax = Integer.MIN_VALUE;

			for(int num : arr) {
				if(num > Max) {
					secdMax = Max;
					Max = num;
				}else if(num > secdMax && num < Max) {
					secdMax = num;
				}		
			}
			if(secdMax == Integer.MIN_VALUE) {
				System.out.println("no second maximum elements");
			}
			
			System.out.println("Max : "+Max+" , SecdMax: "+secdMax);
		}
		
		
		// finding second-min and min
		{
			if(n < 2) {
				System.out.println("Array must contain at least two elements.");
			}
			int Min = Integer.MAX_VALUE;
			int secdMin = Integer.MAX_VALUE;
			for(int num : arr) {
				if(num < Min) {
					secdMin = Min;
					Min = num;
				}else if(num < secdMin && num > Min) {
					secdMin = num;
				}		
			}
			if(secdMin == Integer.MAX_VALUE) {
				System.out.println("no second minimum elements");
			}
			
			System.out.println("Min : "+Min+" , SecdMin: "+secdMin);
		} 
			
			
			
		
	}

}

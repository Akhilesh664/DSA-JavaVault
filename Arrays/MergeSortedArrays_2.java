// ONLY FOR SORTED ARRAYS
// O( n + m ) : [Time complexity iterate in both arrays and sending brr elements into arr ]  
// O( 1 ) : [Space complexity to store m+n elements in arr[] array[ 1 ] ]

package Arrays;

import java.util.Scanner;

public class MergeSortedArrays_2 {

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

		// Intuation :
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

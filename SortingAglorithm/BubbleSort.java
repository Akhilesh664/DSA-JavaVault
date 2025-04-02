// O(n2) : Time complexity [n2 ~ Quadratic]  

package SortingAglorithm;

//💡 BubbleSort: Repeatedly swaps adjacent elements if they are in the wrong order.
//  Time Complexity: O(n²) (Worst & Average), O(n) (Best - Already Sorted).

public class BubbleSort {
	
	public static void main(String[] args) {
	
		// array
		int[] arr = {60,50,13,10,3};
		int n = arr.length;
		
		boolean flag = false;
		// iterate over number passes
		for(int i=1; i<=n-1; i++) {
			// number of comparison
			for(int j=0; j<n-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		
		// printing array 
		int count = 0;
		for (int num : arr) {
		    System.out.print(num);
		    count++;
		    if (count < arr.length) {
		        System.out.print(", ");
		    }
		}
		
	}

}

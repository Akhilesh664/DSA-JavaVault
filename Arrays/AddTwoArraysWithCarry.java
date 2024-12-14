// O(max(n,m)) : [Time complexity iterate in both arrays out of which ever array will be the biggest it will iterate worst max of(n, m) ]  
// O(max(n,m)) : [Space complexity to store max(m,n) elements in array]

package Arrays;

public class AddTwoArraysWithCarry {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 7, 6, 1, 9};
//		int[] arr = {4, 5, 2, 0};
		int n = arr.length;
		int i = n-1;
		
//		int[] brr = {3, 4, 7, 6, 1, 9};
		int[] brr = {9, 8, 2, 0};
		int m = brr.length;
		int j = m-1;
		
		int p = Math.max(n, m);
		int[] crr = new int[p];
		int k = p-1;
		
		int carry = 0;
		
		while(i >= 0 && j>=0 ) {
			int sum = arr[i] + brr[j] + carry;
			
			crr[k] = sum % 10;
			sum = sum/10;
			carry = sum;

			k--;
			i--;
			j--;
		}
//		System.out.print(carry+"  "); // if there is carry out of array then it should be printed
		 
		
		while(i >= 0) {
			crr[k] = arr[i] + carry;
			k--;
			i--;
			carry = 0;
		}

		while(j >= 0) {
			crr[k] = brr[j] + carry ;
			k--;
			j--;
			carry = 0;
		}
		
		// printing crr[]
		for(int num : crr) System.out.print(num + "  ");
		
	}	
	
}

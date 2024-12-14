// O(n) : Time complexity   

package Arrays;

public class MaximumSubArraySum_3KadanesAlgo {
	
	public static void main(String[] args) {
		
		// Creating array
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		
		// Kadane's algorithm
		int sum = 0;
		int maxi = arr[0];
		
		// loop for iteration of array
		for(int i=0; i<n; i++) {
			
			// step 1: update the sum
			sum = sum + arr[i];
			// step 2: update maxi while compare maxi & sum
			maxi = Math.max(maxi, sum);
			// step 3: if sum goes less then 0, then sum = 0. 
			if(sum < 0) {
				sum=0;
			}
			
		}
		
		// printing maxi SumSubArray
		System.out.println("MaximumSubArraySum : "+maxi);
		
	}

}

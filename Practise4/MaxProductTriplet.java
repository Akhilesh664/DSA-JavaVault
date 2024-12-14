// O(n) : Time complexity [n] 

package Practise4;

public class MaxProductTriplet {

	public static void main(String[] args) {
		
		int[] arr = {3, 34, 6, 4, 60, 3, 5, 1, 19};
		int n = arr.length;

		// finding largest no.
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		// edge case
		if(n<3) System.out.println("array is smaller then 3 ");
		
		for(int i=0; i<=n-1; i++) {
			if(arr[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2 ) {
				max3 = max2;
				max2 = arr[i];
			}
			else if(arr[i] > max3 ) {
				max3 = arr[i];
			}
		}
		int product = max1 * max2 * max3;
		System.out.println("Product of maximum Triplet : "+product+" [ "+max1+" X "+max2+" X "+max3+" ] ");
		
	}
	
}

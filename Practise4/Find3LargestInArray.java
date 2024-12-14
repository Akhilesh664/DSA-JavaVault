// O(n) : Time complexity [n] 

package Practise4;

public class Find3LargestInArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 6, 4, 6, 3, 5, 1, 9};
		int n = arr.length;
	
//		int[] brr = new int[3];
		
		// finding largest no.
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		if(n<3) System.out.println("array is smaller then 3 ");
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2 && arr[i]<max1) {
				max3 = max2;
				max2 = arr[i];
			}
			else if(arr[i] > max3 && arr[i]<max2) {
				max3 = arr[i];
			}
		}
		
		System.out.println("max1 : "+max1);
		System.out.println("max2 : "+max2);
		System.out.println("max3 : "+max3);
		
//		// sending to brr
//		brr[0] = max1;
//		brr[1] = max2;
//		brr[2] = max3;
//		
//		for(int i=0; i<brr.length; i++) {
//			  System.out.print(brr[i]+ " ");
//		}
		
	}
}
